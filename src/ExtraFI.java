import java.util.function.*;
import java.util.stream.Stream;

public class ExtraFI {
    public static void main(String[] args) {
        UnaryOperator unaryOperator = (name) -> {
            name += "Sowmiya";
            return name;
        };
        BinaryOperator binaryOperator = (name1, name2) -> {
            return name1 + " is a friend of " +  name2;
        };

        BiConsumer<String, String> biConsumer = (name1, name2) -> {
            System.out.println(name1 + " is a friend of " +  name2);
        };

        BiPredicate<Integer, Integer> biPredicate = (m, n) -> {
            return m == n;
        };

        System.out.println(unaryOperator.apply("Sowmiya"));
        System.out.println(binaryOperator.apply("Sowmiya", "Shreya"));
        biConsumer.accept("Sowmiya", "Shreya");
        System.out.println(biPredicate.test(10, 11));
        System.out.println(biPredicate.test(10, 10));
    }
}
