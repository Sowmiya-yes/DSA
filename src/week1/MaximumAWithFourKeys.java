package week1;

import java.util.Scanner;

public class MaximumAWithFourKeys {
    static int computeMaxA(int n, int[] cache) {
        if(n < 1)
            return 0;
        else if(n <= 6)
            return n;
        int multiplier = 2, max, maxSoFar = 0;
        for(int i = n - 3; i >= 1; i--) {
            if(cache[i] ==   0)
                cache[i] = computeMaxA(i, cache);
            max = multiplier * cache[i];
            if(max > maxSoFar)
                maxSoFar = max;
            multiplier++;
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cache = new int[n + 1];
        System.out.println(computeMaxA(n , cache));
    }
}
