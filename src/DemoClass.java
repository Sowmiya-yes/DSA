import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoClass {
    public static void main(String[] args) {
        String s = "dqwedw";
        System.out.println(        s.substring(0, 4));
//        System.out.println(s.subSequence(0, 5));

        System.out.println(Integer.parseInt("34"));
//        System.out.println(Integer.parseInt("   34"));
        System.out.println(Integer.parseInt("dqws"));
    }
}
