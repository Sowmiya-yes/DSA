package week1;

import java.util.Scanner;

public class RecursiveMultiply {
    static int sum = 0;

    static int recursion(int m, int n) {
        if(n == 0)
            return sum;
        else {
            sum += m;
            return recursion(m, n - 1);
        }
    }

    static int multiplyRecursively(int m, int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return m;
        else
            return recursion(m, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if(m > n)
            System.out.println(multiplyRecursively(m, n));
        else
            System.out.println(multiplyRecursively(n, m));
    }
}
