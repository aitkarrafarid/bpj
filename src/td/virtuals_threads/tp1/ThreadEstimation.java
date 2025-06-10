package td.decoupage.virtuals_threads.tp1;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class ThreadEstimation extends ArgumentsJVM {

    public ThreadEstimation() {
        super();
    }

    public static void main(String[] args) {
        ThreadEstimation estimation = new ThreadEstimation();
        // Runtime pour la HEAP
        Runtime runtime = Runtime.getRuntime();
        long heapUsed = runtime.totalMemory() - runtime.freeMemory();
        long heapMax = runtime.maxMemory();

        // MemoryMXBean pour Non-Heap
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage nonHeapUsage = memoryBean.getNonHeapMemoryUsage();
        long nonHeapUsed = nonHeapUsage.getUsed();

        // OperatingSystemMXBean pour la mémoire physique utilisée par le processus JVM (total, incluant tous les segments)
        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        long jvmPhysicalMemory = osBean.getProcessCpuTime(); // à ne pas confondre, c'est CPU

        // Pour la mémoire réelle utilisée par la JVM
        // JVM total memory : inclut heap + metaspace + thread stacks + buffers natifs, etc.
        long jvmTotalUsed = heapUsed + nonHeapUsed;

        System.out.println("== Mémoire JVM ==");
        System.out.println("Heap utilisé     : " + (heapUsed / (1024 * 1024)) + " Mo");
        System.out.println("Heap max         : " + (heapMax / (1024 * 1024)) + " Mo");

        int availableProcessors = Runtime.getRuntime().availableProcessors(); // Nombre de cœurs CPU
        long threadStackSize = estimation.getXssJvmArgs(); // Taille de pile typique (~1 Mo)
        long estimatedMaxThreads = heapMax / threadStackSize;

        System.out.println("Nombre de cœurs CPU : " + availableProcessors);
        System.out.println("Estimation du nombre de threads disponibles : " + estimatedMaxThreads);
    }
}
