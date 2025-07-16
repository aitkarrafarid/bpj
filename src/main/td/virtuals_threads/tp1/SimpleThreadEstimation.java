package td.virtuals_threads.tp1;

import com.sun.management.OperatingSystemMXBean;
import td.virtuals_threads.services.IArgumentsJVM;
import td.virtuals_threads.services.ImplVariablesArgumentsJVM;

import java.lang.management.ManagementFactory;

public class SimpleThreadEstimation {

    public static void main(String[] args) {
        SimpleThreadEstimation.getInfosJVM();
    }

    public static void getInfosJVM(){
        // Choisis l'implémentation ici
//        IArgumentsJVM argumentsJVM = new ImplDefaultArgumentsJVM();
        // Exemple : -Xmx16m -Xss2m
        IArgumentsJVM argumentsJVM = new ImplVariablesArgumentsJVM();
        // Runtime pour la HEAP
        // La mémoire maximale que la JVM peut allouer (obtenue avec runtime.maxMemory()) correspond essentiellement à la taille maximale du tas (heap) de la JVM.
        // C'est la mémoire réservée pour les objets alloués dans la heap.
        Runtime runtime = Runtime.getRuntime();
        long heapUsed = runtime.totalMemory() - runtime.freeMemory();
        long heapMax = runtime.maxMemory();

        // OperatingSystemMXBean pour la mémoire physique utilisée par le processus JVM (total, incluant tous les segments)
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        long jvmPhysicalMemory = osBean.getProcessCpuTime(); // retourne le temps CPU utilisé

        // Pour la mémoire réelle utilisée par la JVM
        // JVM total memory : inclut heap + metaspace + thread stacks + buffers natifs, etc.
        long jvmTotalUsed = heapUsed ;

        System.out.println("== Mémoire JVM ==");
        System.out.println("Tas/Heap max         : " + (heapMax / (1024 * 1024)) + " Mo");
        System.out.println("Tas/Heap totale      : " + (runtime.totalMemory() / (1024.0 * 1024.0 )) + " Mo");
        System.out.println("Tas/Heap disponible  : " + (runtime.freeMemory() / (1024.0 * 1024.0 )) + " Mo");
        System.out.println("Tas/Heap utilisé     : " + (heapUsed / (1024 * 1024)) + " Mo");

        int availableProcessors = Runtime.getRuntime().availableProcessors(); // Nombre de cœurs CPU
        long threadStackSize = argumentsJVM.getXssJvmArgs(); // Taille de pile typique (~1 Mo)

        System.out.println("---------------------------");
        System.out.println("Pile/Stack           : " + (threadStackSize / (1024 * 1024)) + " Mo");

        long estimatedMaxThreads = heapMax / threadStackSize;

        System.out.println("---------------------------");
//        System.out.println("Nombre de cœurs CPU : " + availableProcessors);
        System.out.println("Estimation du nombre de threads disponibles : " + estimatedMaxThreads);
    }
}
