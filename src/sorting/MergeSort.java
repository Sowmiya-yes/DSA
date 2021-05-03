package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] a, int low, int mid, int high) {
        int[] tmp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while(i <= mid && j <= high) {
            tmp[k++] = a[i] < a[j] ? a[i++] : a[j++];
        }
        while(i <= mid) {
            tmp[k++] = a[i++];
        }
        while(j <= high) {
            tmp[k++] = a[j++];
        }
        k = 0;
        while(low <= high) {
            a[low++] = tmp[k++];
        }
    }

    public static void mergeSort(int[] a, int low, int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 5, 3, 0, 8};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
