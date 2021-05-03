package problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String str = "SowmiyasOWMYA";
        str = str.toLowerCase();

        Map<Character, Integer> charMap = new HashMap<>();
        for(Character ch: str.toCharArray()) {
            if(charMap.containsKey(ch))
                charMap.put(ch, charMap.get(ch) + 1);
            else
                charMap.put(ch, 1);
        }
        for(Character ch: str.toCharArray()) {
            if(charMap.get(ch) == 1) {
                System.out.println(String.format("The first Non repeating charcter in %s is %c", str, ch));
                break;
            }
        }
    }
}
