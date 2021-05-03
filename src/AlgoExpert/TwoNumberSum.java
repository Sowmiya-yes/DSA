package AlgoExpert;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 11, 15, 7};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i  = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                System.out.println(map.get(nums[i]));
                System.out.println(i);
                return;
            } else {
                map.put(target-nums[i], i);
            }
        }
    }

}

//Time complexity O(n)
//Using sliding window protocol achieve O(nlogn)
