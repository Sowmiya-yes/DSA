package Concepts;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamsTips {

    static void display(Employee e) {
        System.out.println(String.format("%d %s", e.id, e.name));
    }
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "Sowmiya"),
                new Employee(2, "Mohit"),
                new Employee(3, "Preethi"),
                new Employee(4, "Siddharth"),
                new Employee(4, "Siddharth")
        };
        List<Employee> employeeList = Arrays.asList(employees);

        //creation of stream from array
//        Stream.of(employees);

        //creation of stream from list
//        employeeList.stream()

        System.out.println("Terminal Operation - forEach");
        employeeList
                .stream()
                .map(e -> e.id)
                .forEach(System.out::println);

        System.out.println("Intemediate Operation - map");
        List<Integer> ids = employeeList.stream()
                .map( e -> e.id)
                .collect(Collectors.toList());
        System.out.println(ids);

        System.out.println("Intemediate Operation - map");
        List<Employee> filteredIds = employeeList.stream()
                .filter(e -> e.id > 1)
                .collect(Collectors.toList());
        System.out.println(filteredIds);

        System.out.println("Terminal Operation with short circuiting - findFirst");
        System.out.println("Intermediate Operations - peek");
        Employee aEmployee  = employeeList.stream()
//                .peek(System.out::println)
                .filter(e -> e.name.contains("o"))
                .findFirst()
                .orElse(null);
        System.out.println(aEmployee);

        System.out.println("Terminal Operation - toArray(name[]::new)");
        Integer[] idArray = employeeList.stream()
                .filter(e -> e.id > 1)
                .map(e -> e.id)
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(idArray));

        System.out.println("Intermediate operation - flatMap for nested collections");
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Sowmiya", "ravikumar"),
                Arrays.asList("Mohit", "Chordia"),
                Arrays.asList("Preethi", "Siddharth")
        );
        System.out.println();
        List<String> nestedResult = nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(nestedResult);

        System.out.println("Terminal Operation - count");
        long count = employeeList.stream()
                .filter(e -> e.id > 1)
                .count();
        System.out.println(count);


        System.out.println("Infinite Streams - skip and limit");
        IntStream numbers  = IntStream.range(0, 10);
//       numbers.forEach(System.out::print);
        numbers.skip(3)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("Intermediate operations - sorted");
        List<Employee> sortedOrder = employeeList.stream()
                .sorted((e1, e2) -> e1.name.compareTo(e2.name))
                .collect(Collectors.toList());

        System.out.println(sortedOrder);

        System.out.println("Intermediate operations - min  max");
        Employee maxId = employeeList.stream()
                .min((e1, e2) -> e1.id - e2.id)
                .orElse(null);

        System.out.println(maxId);

        System.out.println("Intermediate operation - distinct");

        System.out.println("Terminal operation - anyMatch, noneMatch, allMatch");
        boolean status = employeeList.stream()
                .allMatch(e -> e.id < 10);
        System.out.println(status);


        System.out.println("------------------------------------");
        IntStream ints = IntStream.range(0,10);
        System.out.println(ints.min().orElse(0));

        DoubleStream doubles = DoubleStream.of(1.1, 2.2, 3.3);
//        System.out.println(doubles.average().orElse(0.0));
        System.out.println(doubles.sum());

        System.out.println("Reduce - Terminal Operation");
        System.out.println(employeeList.stream()
                .map(e -> e.id)
                .reduce(0, Integer::sum));


//        Collectors.toList(); toSet toMap toCollection
//        Collectors.joining(", ");
//        Collectors.partitioningBy();
//        Collectors.summarizingDouble()
//        Collectors.mapping();
//        Collectors.groupingBy()

//        IntStream i = IntStream.range(1, 10);
//        Map<Boolean, List<Integer>> result  = i.boxed()
//                .collect(Collectors.partitioningBy(o -> o %2 == 0));
//        System.out.println(result);

        Map<Character, List<Employee>> result = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.name.charAt(0)));

        for(Character ch: result.keySet()) {
            System.out.println(result.get(ch));
        }
//
        DoubleStream s = DoubleStream.of(1.1, 10.8);
        System.out.println(s.boxed().collect(Collectors.summarizingDouble(e -> e)).getAverage());
        Map<Character, Set<Integer>> result2 = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.name.charAt(0),
                        Collectors.mapping(e -> e.id, Collectors.toSet())));
//
        for(Character ch: result2.keySet()) {
            System.out.println(result2.get(ch));
        }

//        System.out.println(Stream.of(1,2,3,4,5)
//                .reduce(0, (sum, e) -> sum + e));
    }
}
