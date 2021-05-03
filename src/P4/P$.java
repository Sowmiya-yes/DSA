package P4;

import java.util.Arrays;
import java.util.Collections;

public class P$ {
    public static String reverseWords(String s) {
        String[] stringArray = s.trim().split("\\s+");
        System.out.println(Arrays.toString(stringArray));
        Collections.reverse(Arrays.asList(stringArray));
        System.out.println(Arrays.toString(stringArray));
        return String.join(" ", Arrays.asList(stringArray));
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello   world!  ")+"lk");
    }
}
