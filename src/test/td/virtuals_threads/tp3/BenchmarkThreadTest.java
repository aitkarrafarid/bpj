package td.virtuals_threads.tp3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import td.virtuals_threads.tp1.SimpleThreadEstimation;
import td.virtuals_threads.tp1.SimpleVirtualThreadEstimation;

import java.text.MessageFormat;
import java.util.concurrent.Executors;

public class BenchmarkThreadTest {

    @Test
    @DisplayName("SimpleThreadEstimation")
    public void test1() {
        System.out.println("Starting test");
        SimpleThreadEstimation.getInfosJVM();
    }

    @Test
    @DisplayName("SimpleVirtualThreadEstimation")
    public void test2() {
        System.out.println("Starting test");
        SimpleVirtualThreadEstimation.getInfosJVM();
    }

    @DisplayName("ParameterizedTest")
    @ParameterizedTest
    @ValueSource(ints = {100, 500, 1000, 5000, 10000, 50000})
    public void test3(Integer myTaskCount) throws Exception {
        System.out.println(MessageFormat.format("Starting ParameterizedTest - myTaskCount {0}", myTaskCount));
        int taskCount = myTaskCount;
        int poolThreads = 128;
        System.out.println("\n Thread classique - pool :");
        BenchmarkThread.lancerBenchmark(() -> Executors.newFixedThreadPool(poolThreads), taskCount);
        System.out.println("\n Virtual Threads :");
        BenchmarkThread.lancerBenchmark(() -> Executors.newVirtualThreadPerTaskExecutor(), taskCount);
    }

}