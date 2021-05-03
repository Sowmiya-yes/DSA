import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Async {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<String> future = new CompletableFuture<String>();
//        future.complete("");
//        System.out.println("Getting");
//        System.out.println(future.get()); // checked exceptions
//        // blocking with get
//        System.out.println("Sowmiya");

//        CompletableFuture<String> future = CompletableFuture.completedFuture("Hello");
//        System.out.println(future.get()); // checked exceptions
//        System.out.println("Sowmiya");

//        1. Just want to run an async task, and don't need anything in return
//        takes runnable, return CF(Void), may or may not use get
//        CompletableFuture<Void> cf1 = CompletableFuture.runAsync(() -> {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName());
//        });

//        cf1.get(); // blocking // don't do this

//        2. Want to run an async task, and need to return
//        takes consumer, return CF(T), may or may not use get
//        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName());
//            return "Success";
//        });


//        Thread.sleep(7000);

//        What is the abstract methods in supplier FI
//        Where does all these threads run?
//        System.out.println(cf2.get()); // blocking // don't do this

//        Should you always run in Fork Join pool?

//
//        Executor executor = Executors.newFixedThreadPool(10);
//
//        CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName());
//            return "Success";
//        }, executor);

//        System.out.println(cf3.get());
//        WHAT IF we remove the get?

//        How can you attach callback to an async task?

//        CompletableFuture<String> cf4 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName());
//            return "Success";
//        }).thenApply((message) -> {
//            return message + " is a win";
//        });
//
//        System.out.println(cf4.get());
//
//        CompletableFuture<Void> cf5 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName());
//            return "Accept";
//        }).thenAccept((message) -> {
//            System.out.println(message + " is accepted");
//        });

//        CompletableFuture<Void> cf6 = CompletableFuture.runAsync(() -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Async 1 " + Thread.currentThread().getName());
//            System.out.println("I cant return");
//        }).thenRun(() -> {
//            System.out.println("Async 2 " + Thread.currentThread().getName());
//            System.out.println("I cant accept :(");
//        });
//
//
////
//        CompletableFuture<Void> cf7 = CompletableFuture.runAsync(() -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("Async 3 " +Thread.currentThread().getName());
//        }).thenRunAsync(() -> {
//            System.out.println("Async 4 " + Thread.currentThread().getName());
//        });
//
//        Thread.sleep(5000);
//
//        CompletableFuture<String> result  = CompletableFuture.supplyAsync(() -> {
//                return "Phase 1";
//        }).thenCompose((name) -> CompletableFuture.supplyAsync(() -> {
//            return name + " Phase 2";
//        }));
////
//        System.out.println(result.get());
//
//        CompletableFuture<String> res  = CompletableFuture.supplyAsync(() -> {
//            return "Phase 1";
//        }).thenCombine(CompletableFuture.<String>supplyAsync(() -> {
//            return " Phase 2";
//        }), (m, n) -> m + n);
//
//        System.out.println(res.get());
//
//        CompletableFuture<Void> ress  = CompletableFuture.supplyAsync(() -> {
//            return "Phase 1";
//        }).thenAcceptBoth(CompletableFuture.<String>supplyAsync(() -> {
//            return " Phase 2";
//        }), (m, n) -> System.out.println(m + n));
//
        int a = 1;
        CompletableFuture.supplyAsync(() -> {
            if(a > 5)
                throw new RuntimeException("Exception");
            return "I am before exception";
        }).exceptionally((e) -> {
            System.out.println(e);
            return "I am past exception";
        }).thenAccept((whatIGot) ->  {
            System.out.println("This is what I got " + whatIGot);
        });
//
        CompletableFuture.supplyAsync(() -> {
            if(a > 5)
                throw new RuntimeException("Exception");
            return "I am not from exception";
        }).handle((ans, ex) -> {
            if(ex != null) {
                return "I am from exception!";
            }
            return ans;
        }).thenAccept((whatIGot) ->  {
            System.out.println("This is what I got " + whatIGot);
        });
    }

    static CompletableFuture<String> getPhase1CF(String name) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return name + " Phase 2";
        });
    }
}
