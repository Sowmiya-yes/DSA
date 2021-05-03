package PractiseSet2;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain{
    public static void main(String[] args) {
        int[][] pairs = {{5, 24}, {15, 25}, {27, 40}, {50, 60}};
        Arrays.sort(pairs, (o1, o2) -> {
            return o1[1] - o2[1];
        });
        System.out.println(Arrays.deepToString(pairs));
//        int count = 1, i = 1;
//        int lastMax = pairs[0][1];
//        while(i < pairs.length) {
//            if(pairs[i][0] > lastMax) {De
//                lastMax = pairs[i][1];
//                count++;
//            }
//            i++;
//        }
//        System.out.println(count);
        int[] lcs = new int[pairs.length];
        for(int i = 0; i < pairs.length; i++)
            lcs[i] = 1;
        for(int i  = 1; i < pairs.length; i++) {
            for(int j = 0; j < i; j++) {
                if(pairs[i][0] > pairs[j][1] && lcs[i] <= lcs[j]) {
                    lcs[i] = lcs[j] + 1;
                }
            }
        }
        System.out.println(Arrays.toString(lcs));
        int max = lcs[0];
        for(int i = 1; i < pairs.length; i++) {
            if(lcs[i] > 0) max = lcs[i];
        }
        System.out.println(max);
    }
}
