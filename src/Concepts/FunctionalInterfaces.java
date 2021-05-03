package Concepts;

@FunctionalInterface
interface FunInt {
    void display();
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Anonymous inner class runnable");
//            }
//        };
//        runnable.run();
//
//        Runnable runnable1 = () -> System.out.println("Lambda Runnable");
//
//        runnable1.run();

        FunInt funInt = () -> System.out.println("Own Lambda Based Functional Interface");
        funInt.display();
    }
}
