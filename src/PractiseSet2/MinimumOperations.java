package PractiseSet2;

public class MinimumOperations {
    static int count = 0;
    public static void main(String[] args) {
        int n = 15;
        solveByLoop(n);
        System.out.println(count);
        System.out.println(solveByRecursion(n));
    }

    private static int solveByRecursion(int n) {
        if(n == 1)
            return 1;
        if(n % 2 == 0)
            return solveByRecursion(n/2) + 1;
        else
            return solveByRecursion(n - 1) + 1;
    }

    private static void solveByLoop(int n) {
        while(n > 0) {
            if(n %2 == 0) {
                n = n /2;
                count++;
            } else {
                n = n -1;
                count++;
            }
        }
    }
}
