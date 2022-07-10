package me.shiteship.java8to11.concurrent.callable_and_future;

import java.util.Arrays;
import java.util.concurrent.*;

public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Callable<String> java = () -> {
            Thread.sleep(3000L);
            return "Java";
        };

        Callable<String> keesun = () -> {
            Thread.sleep(1000L);
            return "Keesun";
        };

        String s = executorService.invokeAny(Arrays.asList(hello, java, keesun));
        System.out.println("s = " + s);

        executorService.shutdown();

    }

}
