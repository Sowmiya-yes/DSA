package Day1.subs;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
//        int[] arr = {1,2,1,0};
//        if(arr.length == 0 || arr.length == 1) {
//            System.out.println(arr.length);
//            System.exit(0);
//        }
//        Arrays.sort(arr);
//        int i = 1, count = 1, maxCount = 0;
//        while(i < arr.length) {
//            if(arr[i] - arr[i - 1] == 1) {
//                count++;
//            } else if(arr[i] == arr[i - 1]) {
//                i++;
//                continue;
//            } else {
//                maxCount = Math.max(maxCount, count);
//                count = 1;
//            }
//            i++;
//        }
//        System.out.println(Math.max(count, maxCount));

        System.out.println("-----------");
        for(int i  =0; i < 5; i++) {
            for(int j = 0; j <= 2; j++) {
                if(j == 1)
                    break;
                System.out.println(j);
            }
            System.out.println(i);
        }

        int i = 3;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i++ + ++i);
        System.out.println(i);
     }
}
