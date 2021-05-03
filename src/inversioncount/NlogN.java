package Day1.inversioncount;

import java.util.Arrays;

public class NlogN {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1};
        int[] temp = new int[arr.length];
        int count = divideArray(arr, temp, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }

    private static int divideArray(int[] arr, int[] temp, int low, int high) {
        int count = 0;
        if(low < high) {
            int m = (low + high) / 2;
            count += divideArray(arr, temp, low, m);
            count += divideArray(arr, temp, m + 1, high);
            count += conquerArray(arr, low, m, high);
        }
        return count;
    }

    private static int conquerArray(int[] arr, int low, int m, int high) {
        int i = low, j = m + 1, k = low;
        int[] temp = new int[arr.length];
        int count = 0;
        while(i <= m && j <= high ) {
            if(arr[i] > arr[j]) {
                temp[k++] = arr[j++];
                count += (m - i + 1);
            } else
                temp[k++] = arr[i++];
        }
        while(i <= m) {
            temp[k++] = arr[i++];
        }
        while(j <= high) {
            temp[k++] = arr[j++];
        }
        for(int z = low; z <= high; z++) {
            arr[z] = temp[z];
        }
        return count;
    }
}
