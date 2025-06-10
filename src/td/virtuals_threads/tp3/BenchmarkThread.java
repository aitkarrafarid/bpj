package td.decoupage.virtuals_threads.tp3;

import td.decoupage.virtuals_threads.services.IArgumentsJVM;
import td.decoupage.virtuals_threads.services.ImplVariablesArgumentsJVM;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BenchmarkThread {

    public static void main(String[] args) throws Exception {
        int taskCount = 100;
        int poolThreads = 128;
//        Runtime runtime = Runtime.getRuntime();
//        IArgumentsJVM argumentsJVM = new ImplVariablesArgumentsJVM();
//        int poolThreads = (int) (runtime.maxMemory() / argumentsJVM.getXssJvmArgs());
        System.out.println("Estimation du nombre de threads disponibles (hors VT) : " + poolThreads);
        // Cette méthode crée un ExecutorService qui utilise un seul thread pour exécuter les tâches.
        // Toutes les tâches soumises à ce pool de threads sont exécutées séquentiellement, une après l'autre, par ce seul thread.
//        System.out.println("\n Thread classique :");
//        lancerBenchmark(() -> Executors.newSingleThreadExecutor(), taskCount);
        System.out.println("\n Thread classique - pool :");
        lancerBenchmark(() -> Executors.newFixedThreadPool(poolThreads), taskCount);
        System.out.println("\n Virtual Threads :");
        lancerBenchmark(() -> Executors.newVirtualThreadPerTaskExecutor(), taskCount);
    }
    
    static void lancerBenchmark(Callable<ExecutorService> fournisseur, int nbTaches) throws Exception {
        System.gc(); // Nettoyage mémoire
        Thread.sleep(100);
        long memAvant = memUtilisee();
        long debut = System.currentTimeMillis();
        try (ExecutorService executor = fournisseur.call()) {
            for (int i = 0; i < nbTaches; i++) {
                executor.submit(() -> {
                    try {
                        Thread.sleep(100); // Simule une tâche
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
        }
        long fin = System.currentTimeMillis();
        long memApres = memUtilisee();
        System.out.println("Durée : " + (fin - debut) + " ms");
        System.out.println("Mémoire utilisée : " + (memApres - memAvant) + " Mo");
    }
    static long memUtilisee() {
        Runtime rt = Runtime.getRuntime();
        return (rt.totalMemory() - rt.freeMemory()) / (1024 * 1024);
    }
}
