package Day1.MergeSortedArr;

import java.util.Arrays;

public class NandN {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};
        int temp[] = new int[arr1.length + arr2.length];
        int i = 0, j  = 0, k = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                temp[k] = arr1[i];
                i++;
            } else {
                temp[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr1.length) {
            temp[k]= arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length) {
            temp[k]= arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(temp));
    }
}
