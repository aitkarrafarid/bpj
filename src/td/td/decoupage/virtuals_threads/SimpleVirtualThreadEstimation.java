package td.decoupage.td.decoupage.virtuals_threads;

public class SimpleVirtualThreadEstimation {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory(); // Mémoire max JVM en octets
        // Elle est gérée par la JVM sur le tas (heap)
        // Le paramètre -Xss qui définit la taille de pile pour les threads n’a pas d’effet sur les virtual threads
        long virtualThreadStackSize = 1024 * 10; // Hypothèse : 10 Ko par Virtual Thread

        long estimatedMaxVirtualThreads = maxMemory / virtualThreadStackSize;

        System.out.println("Mémoire max JVM : " + (maxMemory / (1024 * 1024)) + " Mo");
        System.out.println("Estimation du nombre de Virtual Threads disponibles : " + estimatedMaxVirtualThreads);
    }
}
