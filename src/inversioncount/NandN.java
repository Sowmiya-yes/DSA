package Day1.inversioncount;

import java.util.ArrayList;
import java.util.List;

public class NandN {
    public static void main(String[] args) {
//        int[] arr = {8, 4, 2, 1};
        int[] arr = {3, 1, 2};
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    lists.add(new ArrayList<>());
                    lists.get(lists.size() - 1).add(arr[i]);
                    lists.get(lists.size() - 1).add(arr[j]);
                }
            }
        }
        System.out.println(lists);
    }
}
