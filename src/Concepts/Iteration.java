package Concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iteration {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        ListIterator<Integer> itr = a.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
            itr.set(11);
        }

        System.out.println(a);
    }
}
