package Day1.subs;

public class SubArrZeroSum {
    public static void main(String[] args) {
//        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int[] arr = {1, 2, 3};
        int maxCount = 0;
        for(int i = 0; i < arr.length; i++) {
            int sum  = 0, count = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                count++;
                if(sum == 0)
                    maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println(maxCount);
    }
}
