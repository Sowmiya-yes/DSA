package week1;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7, k = 3;

        System.out.println(solveJosephus(n, k));
    }

    private static int solveJosephus(int n, int k) {
        if(n == 0)
            return 0;
        else {
            int res = (solveJosephus(n - 1, k) + k - 1) % n + 1;
            System.out.println(res);
            return res;
        }
    }
}
