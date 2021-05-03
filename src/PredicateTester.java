import java.util.function.Function;
import java.util.function.Predicate;

class PredIntf implements Predicate<Integer> {
    @Override
    public boolean test(Integer num) {
        return num % 2 == 0;
    }
}

public class PredicateTester {
    public static void main(String[] args) {
        Predicate<Integer> predIntf1 = new PredIntf();
        Predicate<Integer> predIntf2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num % 2 == 0;
            }
        };
        Predicate<Integer> predIntf3 = (num) -> num % 2 == 0;
        Predicate<Integer> predIntf4 = (num) ->  {
            return num % 2 == 0;
        };
        System.out.println(predIntf1.test(10));
        System.out.println(predIntf2.test(7));
        System.out.println(predIntf3.test(6));
        System.out.println(predIntf4.test(5));
    }
}