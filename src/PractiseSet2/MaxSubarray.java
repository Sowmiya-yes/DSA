package PractiseSet2;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] sumArray = new int[nums.length];
        sumArray[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(sumArray[i-1] + nums[i] > nums[i])
                sumArray[i] = sumArray[i-1] + nums[i];
            else
                sumArray[i] = nums[i];
        }
        int max  = 0;
        for(int el: sumArray) {
            if(el > max) {
                max = el;
            }
        }
        System.out.println(max);
    }
}
