package Concepts;

class A {

//    A() {
//        System.out.println("Base class");
//    }
    void display() {
        System.out.println("Class A method");
    }

//    void display2() {
//        System.out.println("Class A display2 method");
//    }
}

class B extends A {
    B(int a) {
        System.out.println("Sub class");
    }

    void display() {
        System.out.println("Class B method");
    }

    void display2() {
        System.out.println("Class A display2 method");
    }
}

public class DunamicBinding {
    public static void main(String[] args) {
        A a = new B(2);
        a.display();
//        a.display2();
    }
}
