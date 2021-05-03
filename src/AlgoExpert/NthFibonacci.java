package AlgoExpert;

import java.util.Arrays;
import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int[] a = new int[n+1];
        Arrays.fill(a, Integer.MIN_VALUE);
        if(n == 0 || n == 1)
            System.out.println(n);
        else {
            a[0] = 0;
            a[1] = 1;
            System.out.println(findNthFibo(n, a));
        }
    }

    private static int findNthFibo(int n, int[] a) {
        if(a[n] != Integer.MIN_VALUE) {
            System.out.println("Reusing the cache");
            return a[n];
        } else {
            System.out.println("Calculating for " + n);
            a[n] = findNthFibo(n - 1, a) + findNthFibo(n - 2, a);
            return a[n];
        }
    }
}


//Time Compleity without the Cache/Memoization is O(2^n)
//Time Complexity with the cache is O(n) - number of recursive call
//Space complexity is also O(n) - call stack