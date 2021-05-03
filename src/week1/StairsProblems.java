package week1;

import java.util.Arrays;

public class StairsProblems {
    public static void main(String[] args) {
        int n = 10;
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);
        System.out.println(countWays(n, cache));
    }

    private static int countWays(int n, int[] cache) {
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;
        else if(cache[n] != -1)
            return cache[n];
        else {
            cache[n] = countWays(n - 1, cache) + countWays(n - 2, cache) + countWays(n - 3, cache);
            return cache[n];
        }
    }
}
