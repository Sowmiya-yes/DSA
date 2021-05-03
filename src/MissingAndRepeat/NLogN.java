package Day1.MissingAndRepeat;

public class NLogN {
    //    Approach 1 Time O(nlogn) Space O(1)
    public static void main(String[] args) {
//        int nums[] = {4, 3, 6, 2, 1, 1};
        int nums[] = {3, 1, 3};
        int temp = 0, repeat = -1, missing = -1;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] + 1 == nums[i+1])
                continue;
            else if(nums[i] == nums[i+1])
                repeat = nums[i+1];
            else if(nums[i]+2 == nums[i+1])
                missing = nums[i+1] - 1;
        }
        System.out.println("Missing " + missing + " Repeat " + repeat);
    }
}
