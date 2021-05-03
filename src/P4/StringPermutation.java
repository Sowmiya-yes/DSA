package P4;

import java.util.Arrays;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "AABC";
        permutate(str, 0, str.length() - 1);
    }

    private static void permutate(String str, int l, int r) {
        if(l == r)
            System.out.println(str);
        else {
            for(int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutate(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int l, int i) {
        char[] charArr = str.toCharArray();
        char temp = charArr[l];
        charArr[l] = charArr[i];
        charArr[i] = temp;
        return String.valueOf(charArr);
    }
}
