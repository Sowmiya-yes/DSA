package Day1.MatrixZeros;

import java.util.Arrays;

public class Brute {
    public static void main(String[] args) {
        boolean flag = false;
        int[][] arr = {{0}};
//        int arr[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(i == 0) {
                    if(arr[i][j] == 0)
                        flag = true;
                } else if(arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for(int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[0].length - 1; j >= 0 ; j--) {
                if(i == 0) {
                    if(flag)
                        arr[i][j] = 0;
                } else if (arr[0][j] == 0 || arr[i][0] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
