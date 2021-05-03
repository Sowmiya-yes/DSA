package TreesAndGraphs;

import java.util.Arrays;

public class StringyString {
    public static void main(String[] args) {
        String[] strings = {"sowmi", "punk", "pareek", "chakkus"};
        int[] weight = new int[strings.length];
        for(int el = 0; el < strings.length; el++) {
            int sum = 0;
            for(int i = 0; i < strings[el].length(); i++) {
                sum += strings[el].charAt(i) - 96;
            }
            weight[el] = sum;
        }
    }
}
