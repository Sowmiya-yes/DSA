package Day1;

import java.util.Arrays;

public class Sort012 {

    void swap(int[] nums, int left, int right) {
        int temp  = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
//    Approach 2 - Time O(n) Space O(1)
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

//    Approach 1 Time O(2n) Space = 3
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 2, 0, 1, 2, 0, 1};
        int temp = 0;
        int[] store = new int[3];
        for(int i = 0; i < arr.length; i++) {
            store[arr[i]] = store[arr[i]] + 1;
        }
        System.out.println(Arrays.toString(store));
        for(int i = 0; i < store.length; i++) {
            while(store[i] > 0) {
                arr[temp] = i;
                store[i] = store[i] - 1;
                temp++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
