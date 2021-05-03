package week1;

public class CountPossiblePathsInMatrix {

    static int countRecursive(int m, int n) {
        if(m == 1 || n == 1)
            return 1;
        return countRecursive(m, n - 1) + countRecursive(m - 1, n);
    }

    public static void main(String[] args) {
        System.out.println(countRecursive(2, 8));
    }
}
