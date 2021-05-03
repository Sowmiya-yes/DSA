package PractiseSet2;

import java.util.Arrays;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String string1 = "abcdfa", string2 = "abcdzj";
        int result = -1;
        int[][] matrix = new int[string1.length()+1][string2.length()+1];
        for(int i = 0; i <= string1.length(); i++) {
            for(int j = 0; j <= string2.length(); j++) {
                if(i == 0 || j == 0) matrix[i][j] = 0;
                else if(string1.charAt(i-1) == string2.charAt(j-1)) {
                    matrix[i][j] = matrix[i-1][j-1] + 1;
                    result = Math.max(result, matrix[i][j]);
                } else
                    matrix[i][j] = 0;
            }
        }
        System.out.println(result);
        int result2 = -1;
        int[][] matrix2 = new int[string1.length()+1][string2.length()+1];
        for(int i = 0; i <= string1.length(); i++) {
            for(int j = 0; j <= string2.length(); j++) {
                if(i == 0 || j == 0) matrix2[i][j] = 0;
                else if(string1.charAt(i-1) == string2.charAt(j-1))
                    matrix2[i][j] = matrix2[i-1][j-1] + 1;
                else
                    matrix2[i][j] = Math.max(matrix2[i - 1][j], matrix2[i][j - 1]);
                result2 = Math.max(result2, matrix2[i][j]);
            }
        }
        System.out.println(result2);
    }
}
