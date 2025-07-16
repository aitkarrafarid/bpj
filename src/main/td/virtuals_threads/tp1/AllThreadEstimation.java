package td.virtuals_threads.tp1;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class AllThreadEstimation {

    private static final long MB = 1024 * 1024;
    private final long threadStackSize;

    public AllThreadEstimation(long threadStackSize) {
        this.threadStackSize = threadStackSize;
    }

    public void afficherEstimation() {
        // Mémoire JVM
        Runtime runtime = Runtime.getRuntime();
        long heapUsed = runtime.totalMemory() - runtime.freeMemory();
        long heapMax = runtime.maxMemory();

        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        long nonHeapUsed = memoryBean.getNonHeapMemoryUsage().getUsed();
        long jvmTotalUsed = heapUsed + nonHeapUsed;

        System.out.println("== Mémoire JVM ==");
        System.out.printf("Heap utilisé     : %d Mo%n", heapUsed / MB);
        System.out.printf("Heap max         : %d Mo%n", heapMax / MB);
        System.out.printf("Total JVM utilisé: %d Mo%n", jvmTotalUsed / MB);

        // Threads
        int availableProcessors = runtime.availableProcessors();
        long estimatedMaxThreads = heapMax / threadStackSize;

        System.out.println("\n== Threads ==");
        System.out.println("Cœurs CPU disponibles : " + availableProcessors);
        System.out.println("Taille de stack thread: " + (threadStackSize / 1024) + " Ko");
        System.out.println("Estimation du nombre maximal de threads : " + estimatedMaxThreads);
    }

    public static void main(String[] args) {
        long stack1Mo = 1024 * 1024;     // 1 Mo
        long stack10Ko = 1024 * 10;      // 10 Ko

        System.out.printf("%n== Thread classique ==%n");
        new AllThreadEstimation(stack1Mo).afficherEstimation();

        System.out.printf("%n== Thread virtuel ==%n");
        new AllThreadEstimation(stack10Ko).afficherEstimation();
    }
}
