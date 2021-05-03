package Day1;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] permutation = {3, 2, 1};
        int len  = permutation.length;
        int BP = permutation[len - 1], idx = len - 1, SP = len - 1;
        for(int i = len - 2; i >= 0; i--) {
            if(permutation[i] < permutation[i + 1]) {
                BP = permutation[i];
                idx = i;
                break;
            }
        }
        for(int i = len - 2; i >= idx; i--) {
            if(permutation[i] < BP) {
                SP = i;
                break;
            }
        }
        System.out.println(idx + " " + SP);
        if(idx != SP) {
            int temp = permutation[idx];
            permutation[idx] = permutation[SP];
            permutation[SP] = temp;

            int lastIdx = len - 1, firstIdx = idx + 1;
            while (firstIdx < lastIdx) {
                temp = permutation[lastIdx];
                permutation[lastIdx] = permutation[firstIdx];
                permutation[firstIdx] = temp;
                firstIdx++;
                lastIdx--;
            }
        } else {
            Arrays.sort(permutation);
        }
        System.out.println(Arrays.toString(permutation));
    }
}
