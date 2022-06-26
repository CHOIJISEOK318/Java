package me.shiteship.java8to11.concurrent.completable_future;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
//            System.out.println("Hello " + Thread.currentThread().getName());
//        });
//        future.get();

//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            return "Hello";
//        }).thenApply((s) ->{
//            System.out.println(Thread.currentThread().getName());
//            return s.toUpperCase(Locale.ROOT);
//        });

//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            return "Hello";
//        }).thenAccept((s)->{
//            System.out.println("s = " + s);
//        });

//        ExecutorService executorService = Executors.newFixedThreadPool(4);

//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            return "Hello";
//        },executorService).thenRun(()->{
//            System.out.println(Thread.currentThread().getName());
//        });

//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            return "Hello";
//        },executorService).thenRunAsync(()->{
//            System.out.println(Thread.currentThread().getName());
//        },executorService);
//
//        System.out.println("future = " + future.get());
//
//        executorService.shutdown();

        /**
         * *************************************************************************
         */

//        CompletableFuture<String> hello = CompletableFuture.supplyAsync(()->{
//            System.out.println("Hello" + Thread.currentThread().getName());
//            return "Hello";
//        });

//        // 의존관계 o
//        CompletableFuture<String> future = hello.thenCompose(App::getWorld);
//        System.out.println("future = " + future.get());
//
//        CompletableFuture world = CompletableFuture.supplyAsync(()->{
//            System.out.println("World" + Thread.currentThread().getName());
//            return "World";
//        });
//
//        hello.thenCombine(world, (h,w)-> h + " " + w);
//
//        CompletableFuture.allOf(hello,world)
//                .thenAccept(System.out::println);

//        List<CompletableFuture> futures = Arrays.asList(hello,world);
//        CompletableFuture[] futuresArray = futures.toArray(new CompletableFuture[futures.size()]);

//        CompletableFuture<List<String>> results = CompletableFuture.allOf(futuresArray)
//                .thenApply(v -> {
//                    return futures.stream()
//                            .map(CompletableFuture::join)
//                            .collect(Collectors.toList());
//                });
//
//        results.get().forEach(System.out::println);

        boolean throwError = true;
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(()->{
            System.out.println("Hello" + Thread.currentThread().getName());
            return "Hello";
        }).handle((s, throwable) -> {
            if(throwable != null){
                return "Error!";
            }
            return s;
        });

        System.out.println("hello = " + hello.get());

    }

    private static CompletableFuture<String> getWorld(String message){
        return CompletableFuture.supplyAsync(()->{
            System.out.println("World " + Thread.currentThread().getName());
            return message + " World";
        });
    }

}
