package week1;

import java.util.Scanner;

public class RecursiveMultiplyOptimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int big = scanner.nextInt();
        int small = scanner.nextInt();

        if(big > small) {
            System.out.println(System.nanoTime());
            int[]cache = new int[small + 1];
            System.out.println(multiplyHelper(big, small, cache));
            System.out.println(System.nanoTime());
        }
        else {
            System.out.println(System.nanoTime());
            int[]cache = new int[big + 1];
            System.out.println(multiplyHelper(big, small, cache));
            System.out.println(System.nanoTime());
        }
    }

    private static int multiplyHelper(int big, int small, int[] cache) {
        if(small == 0)
            return 0;
        else if(small == 1)
            return big;
        else if(cache[small] > 0)
            return cache[small];
        int s = small >> 1;
        int side1 = multiplyHelper(big, s, cache);
        int side2 = side1;

        if(small % 2 == 1)
            side2 = multiplyHelper(big, small - s, cache);

        cache[small] = side1 + side2;

        return cache[small];
    }
}
