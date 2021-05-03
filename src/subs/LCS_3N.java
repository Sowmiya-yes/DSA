package Day1.subs;

import java.util.HashSet;
import java.util.Set;

public class LCS_3N {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1};
        if(arr.length == 0 || arr.length == 1) {
            System.out.println(arr.length);
            System.exit(0);
        }
        int maxCount = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for(int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i] - 1)) {
                int count = 1, current = arr[i];
                while(set.contains(current + 1)) {
                    count++;
                    current = current + 1;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println(maxCount);
    }
}
