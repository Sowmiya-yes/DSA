package PractiseSet2;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatingCharater {
    public static void main(String[] args) {
        String str = "abcabc";
        StringBuilder newStr = new StringBuilder("");
        Set<Character> set = new LinkedHashSet<>();
        for(char i: str.toCharArray()) {
            if(set.size() > 0) {
                if(set.contains(i))
                    set.remove(i);
                else
                    set.add(i);
                if(set.size() > 0)
                    newStr.append(set.toArray()[0]);
                else
                    newStr.append("#");
            } else {
                set.add(i);
                newStr.append(set.toArray()[0]);
            }
        }
        System.out.println(newStr);
    }
}
