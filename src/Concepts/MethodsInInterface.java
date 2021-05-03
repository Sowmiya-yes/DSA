package Concepts;

interface IntFOne {
//    default void getNumber() {
//        System.out.println("nkn");;
//    }

    static void getSt() {
        System.out.println("iysh");;
    }

//    default String toString() {
//
//    }
}

interface IntFTwo {
    default void getNumber() {
        System.out.println("saw");;
    }

    static void getSt() {
        System.out.println("dsd");;
    }
}

public class MethodsInInterface implements IntFOne, IntFTwo{
    public static void main(String[] args) {
        MethodsInInterface methodsInInterface = new MethodsInInterface();
        methodsInInterface.getNumber();
        IntFTwo.getSt();
        IntFOne.getSt();
    }
}
