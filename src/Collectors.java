import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Collectors {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getPriority());
        PopulateFruits populateFruits = new PopulateFruits();
        List<Fruits> fruitsList = populateFruits.getFruitsList();

//        .collect(Collectors.toList())
//        toSet()
//        toMap()
        System.out.println("------Joining-----------");
        String fruitString = fruitsList.stream()
                .map(Fruits::getFruitName)
                .collect(java.util.stream.Collectors.joining(" || "));
        System.out.println(fruitString);

        System.out.println("----------ToSet-------------");
        System.out.println(
                fruitsList.stream()
                    .map(Fruits::getColor)
                    .collect(java.util.stream.Collectors.toSet())
        );

        System.out.println("----------ToList------------");
        List<String> fruitNames = fruitsList.stream()
                .map(Fruits::getFruitName)
                .collect(java.util.stream.Collectors.toUnmodifiableList());

        System.out.println(fruitNames);
//        fruitNames.add(0, "Sowmiya");
//        System.out.println(fruitNames);

        System.out.println("-------------Distinct----------");
        System.out.println(
                fruitsList.stream()
                        .map(Fruits::getColor)
                        .distinct()
                        .collect(java.util.stream.Collectors.toList())
        );

        System.out.println("-----------toMap-------");
        System.out.println(
                fruitsList.stream()
                    .collect(java.util.stream.Collectors.toMap(Fruits::getFruitName, Fruits::getColor))
        );

        System.out.println("-----------Boxed and partitioning by------------");
        Map<Boolean, List<Integer>> oddEven = IntStream.range(0, 10)
                .boxed()
                .collect(java.util.stream.Collectors.partitioningBy(e -> e % 2 == 0));

        System.out.println(oddEven.get(true));
        System.out.println(oddEven.get(false));

        System.out.println("-----------Grouping By---------------");
        Map<String, List<Fruits>> fruitsMap = fruitsList.stream()
                .collect(java.util.stream.Collectors.groupingBy(Fruits::getColor));

        System.out.println(fruitsMap);
//        fruitsMap.get("red").forEach(e -> System.out.println(e.getFruitName()));

        System.out.println("------------");
        Map<String, String> fruitsStringMap = fruitsList.stream()
                .collect(java.util.stream.Collectors.groupingBy(Fruits::getColor,
                        java.util.stream.Collectors.mapping(e -> e.getFruitName().toLowerCase(), java.util.stream.Collectors.joining(" -- "))));

        System.out.println(fruitsStringMap);
//        fruitsStringMap.get("Apple").forEach(e -> System.out.println(e));
//        DoubleStream.of(1.1, 10.9, 5.5).summaryStatistics();)
        System.out.println(IntStream.range(1, 10).boxed().collect(java.util.stream.Collectors.summarizingInt(e -> e)));
    }
}
