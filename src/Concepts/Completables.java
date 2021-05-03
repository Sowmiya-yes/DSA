package Concepts;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Completables {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
    CompletableFuture<Boolean> task1 = CompletableFuture.supplyAsync(() -> {
        int count = 0;
        for(int i = 0; i < 100000; i++) {
            count++;
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task 1 completed");
        return true;
    });

    CompletableFuture<Boolean> task2 = CompletableFuture.supplyAsync(() -> {
        int count = 0;
        for(int i = 0; i < 100000; i++) {
            count++;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task 2 completed");
        return true;
    });

    CompletableFuture<Boolean> task3 = CompletableFuture.supplyAsync(() -> {
        int count = 0;
        for(int i = 0; i < 100000; i++) {
            count++;
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task 3 completed");
        return true;
    });
        //supplyAsync
        //runAsync
        //thenApplyAsync
        //handleAsync

        CompletableFuture<Void> allfutures = CompletableFuture.allOf(task1, task2, task3);
        System.out.println("All tasks completed");
    }
}
