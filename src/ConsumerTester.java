import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

class ConsumeIntf implements Consumer<String> {

    @Override
    public void accept(String motivation) {
        System.out.println(motivation);
    }
}

public class ConsumerTester {
    public static void main(String[] args) {
        Consumer<String> supplyIntf1 = new ConsumeIntf();
        Consumer<String> supplyIntf2 = new Consumer<String>() {
            @Override
            public void accept(String motivation) {
                System.out.println(motivation);
            }
        };
        Consumer<String> supplyIntf3 = System.out::println;
        Consumer<String> supplyIntf4 = System.out::println;
        supplyIntf1.accept("You can do it");
        supplyIntf2.accept("You can win");
        supplyIntf3.accept("You are doing well");
        supplyIntf4.accept("Keet it up");
//
//        Stream<Integer> s = Stream.of(null);
//        System.out.println(s);


        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();
        copy.add(1);
        copy.add(2);
        Iterator<Integer> copyItr = copy.iterator();
        Iterator<Integer> itr = l.iterator();
        while(itr.hasNext()) {
            int n = itr.next();
            if(n > 1)
//                l.add(10);
                itr.remove();
            else
                System.out.println(n);
        }
        while(copyItr.hasNext()) {
            int n = copyItr.next();
            if(n > 1)
                l.add(1);
            else
                System.out.println(n);
        }
    }
}