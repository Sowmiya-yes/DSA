package Day1;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int[][] temp = new int[arr.length][arr[0].length];
        int current = arr[0].length - 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                temp[j][current] = arr[i][j];
            }
            current--;
        }
        System.out.println(Arrays.deepToString(temp));
    }
}
