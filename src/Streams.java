import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        Stream<Integer> intStream = List.of(1, 10, 20, 30, 40).stream();

        Stream<Integer> integerStream = Stream.of(1, 10, 20, 30, 40);

        int[] intArray = {11, 2, 31, 4, 5};

        Arrays.asList(1, 3, 5, 7, 9).stream().skip(2).limit(2).forEach(System.out::print);

        System.out.println();
        Arrays.asList(2, 4, 6, 8, 10).parallelStream().forEach(System.out::println);

        System.out.println("-----------------------------------------------------");
//        integerStream.forEach(e -> e * 2); cannot do something like this
        integerStream.forEach(e -> multiply(e));

        System.out.println("-----------------------Find first------------------------------");
        Integer result  = intStream
                .peek(System.out::println)
                .peek(e -> multiplyReturn(e))
                .findFirst()
                .orElse(0);

        System.out.println(result);

        System.out.println("End");
        Arrays.asList(Arrays.asList(1, 2, Arrays.asList(11, 12)), Arrays.asList(3, 4)).stream()
                .flatMap(Collection::stream).peek(System.out::println).forEach(System.out::println);

        Stream.of(1, 2, 33, 11, 9).sorted().forEach(System.out::print);

        System.out.println(Stream.of("abc", "ndad","sq").max((e1, e2) -> e1.compareTo(e2)).orElse(""));

        System.out.println(Stream.of(1, 2, 3, 2, 1, 4).distinct().collect(Collectors.toList()));

        System.out.println(Stream.of(1, 2, 3, 2, 1, 4).allMatch(e -> e > 10));

        System.out.println(IntStream.of(1, 2, 3, 2, 1, 4).summaryStatistics());

        System.out.println(Stream.of(1, 2, 3, 2, 1, 4).reduce(100, (e, f) -> e + f));

    }

    static void multiply(int element) {
        System.out.println(element * 2);
    }

    static int multiplyReturn(int element) {
        return (element * 2);
    }
}
