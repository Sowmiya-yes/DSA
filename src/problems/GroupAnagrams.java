package problems;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strList = {"cat", "dog", "act", "god", "tac"};
        Map<String, List<String>> map = new HashMap<>();
        String[] result = new String[strList.length];

        for(String s: strList) {
            char[] seq = s.toCharArray();
            Arrays.sort(seq);
            String anagram = new String(seq);
            if(map.containsKey(anagram))
                map.get(anagram).add(s);
            else {
                List<String> l = new ArrayList<>();
                l.add(s);
                map.put(anagram, l);
            }
            new Stack<>().
        }
        int i = 0;
        for(String key: map.keySet()) {
            List<String> groups = map.get(key);
            for(String el: groups) {
                result[i++] = el;
            }
        }
        for(String el: result) {
            System.out.print(el + " ");
        }
    }
}
