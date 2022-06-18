package me.shiteship.java8to11.concurrent.excutor;

import java.util.concurrent.*;

public class App {

    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(() -> {
//
//            System.out.println("Thread: " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(3000L);
//            } catch (InterruptedException e) {
//                throw new IllegalStateException(e);
//            }
//        });
//
//        thread.start();
//
//        System.out.println("Hello: " + Thread.currentThread().getName());
//        thread.join();
//        System.out.println(thread + " is finished");

//        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//        executorService.scheduleAtFixedRate(getRunnable("Hello"),1,2, TimeUnit.SECONDS);



    }

    private static Runnable getRunnable(String message){
        return () -> System.out.println(message + Thread.currentThread().getName());
    }
}
