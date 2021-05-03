package Concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Java8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5));

//        System.out.println("imperative styles of programming");
//        for(int i = 0; i < list.size(); i++) {
//            if(i > 2)
//                list.remove(i);
//            System.out.println(list);
//        }
//        System.out.println(list);
//
//        for(int i: list) {
//            if(i > 5)
//                list.remove(i);
//        }
//
//        System.out.println(list);
//
//        System.out.println("Using Iterators");
//        Iterator<Integer> iterator = list.iterator();
//        ListIterator<Integer> iterator1 = list.listIterator();
//        iterator1.
//        while(iterator.hasNext()) {
//            int temp = iterator.next();
//            if(temp > 3)
//                iterator.remove();
//            System.out.println(list);
//        }
        System.out.println("Java 8 forEach");
        Consumer1 consumer1 = new Consumer1();
        list.forEach(consumer1);
    }

    static class Consumer1 implements Consumer<Integer> {

        @Override
        public void accept(Integer integer) {
            System.out.println(integer);
        }
    }
}
