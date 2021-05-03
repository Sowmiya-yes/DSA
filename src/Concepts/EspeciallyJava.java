package Concepts;

public class EspeciallyJava {
    protected int a = 1;
    public static void main(String[] args) {
        String a = "dxaw";
        String b = new String("dxaw");
        String c = b.intern();
//        System.out.println(b.intern().hashCode());
        System.out.println(a == b); //false
        System.out.println(b == c); //false
        System.out.println(a == c); // true
    }
}


