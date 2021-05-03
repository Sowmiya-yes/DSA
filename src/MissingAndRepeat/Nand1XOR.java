package Day1.MissingAndRepeat;

public class Nand1XOR {
    public static void main(String[] args) {
        int nums[] = {4, 3, 6, 2, 1, 1};

        int xor = 0;
        for(int i: nums) {
            xor ^= i;
        }
        for(int i = 1; i <= nums.length; i++) {
            xor ^= i;
        }

        int righiBitSet = xor & -xor;
        System.out.println(-xor);
        int x = 0, y = 0;
        for(int i: nums) {
            if ((i & righiBitSet) != 0)
                x ^= i;
            else
                y ^= i;
        }
        for(int i = 1; i <= nums.length; i++) {
            if((i & righiBitSet) != 0)
                x ^= i;
            else
                y ^= i;
        }
        System.out.println("x: " +  x + " y: " + y);
    }
}
