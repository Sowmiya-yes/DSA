package problems;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar {

    public static int countChar(String seq, char chr, int occurrence) {
        if(seq == null || seq.length() <= 0) return occurrence;
        if(seq.charAt(0) == chr) occurrence++;
        return countChar(seq.substring(1), chr, occurrence);
    }

    public static void main(String[] args) {
        /*
        * Using Enhanced for loop to count the occurrence of a character in a string
        * */
        String str = "SowmiyaRavikumar";
        str = str.toLowerCase();
        char toFind = 'i';
        int count = 0;
        for(char c: str.toCharArray()) {
            if(c == toFind)
                count++;
        }
        System.out.println(String.format("The character %c occurs %d times in %s", toFind, count, str));

        /*
        * Using hashMap to count the occurrence of each character of a string
        * */
        Map<Character, Integer> charMap = new HashMap<>();
        for(char c: str.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        for(Character ch: charMap.keySet()) {
            System.out.println(String.format("Character %c is present %d times in %s", ch, charMap.get(ch), str));
        }

        /*
        * using recursion to count the occurrence of a character in a string
        * */
        System.out.println(String.format("The character %c occurs %d times in %s", toFind, countChar(str, 'i', 0), str));
    }
}
