package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        int target = 0;
        Arrays.sort(arr);
        List<List<Integer>> result = KSumRecursive(arr, target, 0, 4);
        System.out.println(result);
    }

    private static List<List<Integer>> KSumRecursive(int[] arr, int target, int start, int k) {
        if(k == 2) {
            int left = start, right = arr.length - 1;
            List<List<Integer>> list = new ArrayList<>();
            while(left < right) {
                int sum = arr[left] + arr[right];
                if(sum == target) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(arr[left]);
                    tmp.add(arr[right]);
                    list.add(tmp);
                    while(left < right && arr[left+1] == arr[left])
                        left++;
                    while(left < right && arr[right-1] == arr[right])
                        right++;
                    left++;
                    right--;
                } else if(sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return list;
        } else {
            List<List<Integer>> result = new ArrayList<>();
            for(int i = start; i < arr.length - k + 1; i++) {
                List<List<Integer>> two_sums = KSumRecursive(arr, target - arr[i], i + 1, k - 1);
                for(List<Integer> el: two_sums) {
                    el.add(arr[i]);
                    result.add(el);
                }
                while(arr[i+1] == arr[i] && i < arr.length - k)
                    i++;
            }
            return result;
        }
    }
}
