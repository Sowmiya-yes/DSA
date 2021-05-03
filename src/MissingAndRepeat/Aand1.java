package Day1.MissingAndRepeat;

public class Aand1 {
    public static void main(String[] args) {
        int nums[] = {4, 3, 6, 2, 1, 1};
        int sumE = 0, sumA = 0, sum2E = 0, sum2A = 0;
        for(int i = 1; i <= nums.length; i++) {
            sumE += i;
        }
        for(int i = 0; i < nums.length; i++) {
            sumA += nums[i];
        }
        for(int i = 1; i <= nums.length; i++) {
            sum2E += i * i;
        }
        for(int i = 0; i < nums.length; i++) {
            sum2A += nums[i] * nums[i];
        }
        int diffSum = sumE - sumA;
        int diffSum2 = sum2E - sum2A;

        int xplusy = diffSum2 / diffSum;

        int x = (xplusy + diffSum) / 2;

        int y = xplusy - x;

        System.out.println("x: " +  x + " y: " + y);

    }
}
