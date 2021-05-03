package P4;

public class LongestPalindrominSubstring {
    public static void main(String[] args) {
        String str = "AAAABBAA";
        int n = str.length();
        int[][] cache = new int[n][n];
        int start = 0, max = 0;
        for(int i = 0; i < n; i++) {
            cache[i][i] = 1;
            max = 1;
        }

        for(int i = 0; i < n - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                cache[i][i + 1] = 1;
                start = i;
                max = 2;
            }
        }

        int k = 0;
        for(int i = 2; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                k = j + i;
                if(str.charAt(j) == str.charAt(k) && cache[j + 1][k - 1] == 1) {
                    cache[j][k] = 1;
                    start = j;
                    max = k;
                }
            }
        }

        System.out.println(str.substring(start, max+1));
    }
}
