package week1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        List<Integer> collection = new ArrayList<>();
        List<List<Integer>> resultSet = new ArrayList<>();

        findSubsetsRecursively(set, collection, resultSet, 0);

        System.out.println(resultSet);
    }

    private static void findSubsetsRecursively(Set<Integer> set, List<Integer> collection, List<List<Integer>> resultSet, int start) {
        if(start == set.size()) {
            return;
        }
        for(int i = start; i < set.size(); i++) {
            collection.add((Integer) set.toArray()[i]);
            resultSet.add(new ArrayList<>(collection));
            findSubsetsRecursively(set, collection, resultSet, i + 1);
            collection.remove(collection.size() - 1);
        }
    }
}
