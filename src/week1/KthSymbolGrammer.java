package week1;


public class KthSymbolGrammer {

    static int recursiveGrammar(int n, int k) {
        if(n == 1)
            return 0;
        if(k % 2 == 0)
            return recursiveGrammar(n - 1, k / 2) == 0 ? 1 : 0;
        else
            return recursiveGrammar(n - 1, (k + 1) / 2);
    }

    public static void main(String[] args) {
        System.out.println(recursiveGrammar(3, 3));
    }
}
