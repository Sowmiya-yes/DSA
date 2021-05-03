package Day1.MergeSortedArr;

import java.util.Arrays;

public class Nand1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};
        int j = arr2.length - 1, last = -1, i;
        while(j >= 0) {
            i = arr1.length - 2;
            last = arr1[arr1.length - 1];
            while(i >= 0 && arr1[i] > arr2[j]) {
                arr1[i+1] = arr1[i];
                i--;
            }
            if(last != arr1[arr1.length - 1] && i >= 0) {
                arr1[i+1] = arr2[j];
                arr2[j] = last;
            }
            j--;
        }
        System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
    }
}
