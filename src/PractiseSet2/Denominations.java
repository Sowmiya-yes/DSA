package PractiseSet2;

import java.util.Arrays;
import java.util.Collections;

public class Denominations {

    public static void main(String[] args) {
        int[] coins = { 1, 5, 6, 9};
//        Arrays.sort(denomination, Collections.reverseOrder());
//        int count = 0;
        int total = 11;
//        int i = 0;
//        while(amount > 0) {
//            if(denomination[i] > amount) {
//                i++;
//            } else {
//                amount -= denomination[i];
//                System.out.println(denomination[i]);
//                count++;
//            }
//        }
//        System.out.println(count);
        int[] T = new int[total+1];
        T[0] = 0;
        for(int i = 1; i <= total; i++)
            T[i] = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++) {
            for(int j = 1; j <= total; j++) {
                if(j >= coins[i])
                    T[j] = Math.min(T[j], T[j - coins[i]] + 1);
            }
        }
        System.out.println(Arrays.toString(T));
    }
}
