package PractiseSet2;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,3};
        int[] temp = new int[arr.length];
        Arrays.fill(temp, 1);
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && temp[i] <= temp[j])
                    temp[i] = temp[j] + 1;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int el: temp) {
            if(el > max)
                max = el;
        }
        System.out.println(max);
    }
}
