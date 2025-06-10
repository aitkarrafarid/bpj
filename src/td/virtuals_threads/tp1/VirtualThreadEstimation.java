package td.decoupage.virtuals_threads.tp1;

public class VirtualThreadEstimation {
    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory(); // Mémoire max JVM en octets
        long virtualThreadStackSize = 1024 * 10; // Hypothèse : 10 Ko par Virtual Thread

        long estimatedMaxVirtualThreads = maxMemory / virtualThreadStackSize;

        System.out.println("Mémoire max JVM : " + (maxMemory / (1024 * 1024)) + " Mo");
        System.out.println("Estimation du nombre de Virtual Threads disponibles : " + estimatedMaxVirtualThreads);
    }
}
