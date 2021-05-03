package PractiseSet2;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int len = nums.length;
        if(len == 0)
            System.out.println(0);
        else if(len == 1)
            System.out.println(nums[0]);
        int[] moneySum = new int[len];
        moneySum[0] = nums[0];
        moneySum[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < len; i++) {
            System.out.println(Arrays.toString(moneySum));
            moneySum[i] = Math.max(nums[i] + moneySum[i - 2], moneySum[i - 1]);
        }
        System.out.println(Arrays.toString(moneySum));
//        System.out.println(moneySum[len-1]);
    }
}
