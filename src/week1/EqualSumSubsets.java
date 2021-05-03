package week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Program {
    boolean result = false;

    public void findSubsetsRecursively(int[] nums, List<Integer> combinations,
                                       Map<Integer, Integer> resultMap, int start, int k) {
        if(start == nums.length)
            return;

        if(result)
            return;

        for(int i = start; i < nums.length; i++) {
            combinations.add(nums[i]);

            System.out.println(combinations);

            int sum = 0;
            for(int el: combinations) {
                sum += el;
            }
            if(resultMap.containsKey(sum)) {
                resultMap.put(sum, resultMap.get(sum) + 1);
                if(resultMap.get(sum) == k) {
                    result = true;
                    return;
                }
            } else
                resultMap.put(sum, 1);

            System.out.println(resultMap);

            findSubsetsRecursively(nums, combinations, resultMap, i + 1, k);
            combinations.remove(combinations.size() - 1);
        }
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {

        List<Integer> combinations = new ArrayList<>();

        Map<Integer, Integer> resultMap = new HashMap<>();

        findSubsetsRecursively(nums, combinations, resultMap, 0, k);

        if(result)
            return true;
        return false;
    }
}

public class EqualSumSubsets {
    public static void main(String[] args) {
        Program program = new Program();
        System.out.println(program.canPartitionKSubsets(new int[]{2, 2, 2, 2, 3, 4, 5}, 4));
    }
}
