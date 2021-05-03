package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedMerge {
    public static void main(String[] args) {
        //considering a1 has buffer to occupy a2 elements
        int[] a1 = {1, 7, 9, 11, 0, 0, 0, 0};
        int[] a2= {2, 4, 13, 15};
        int idxA = 3, idxB = 3, idxSorted = 7;
        while(idxB >= 0 && idxA >= 0) {
            if(a1[idxA] > a2[idxB]) {
                a1[idxSorted--] = a1[idxA--];
            }
            else {
                a1[idxSorted--] = a2[idxB--];
            }
        }
        while(idxA >= 0)
            a1[idxSorted--] = a1[idxA--];
        while(idxB >= 0)
            a1[idxSorted--] = a2[idxB--];
        for(int el: a1) {
            System.out.print(el+ ",");
        }

        System.out.println();
        //a3 is used to store sorted elemets from a1 and a2
        int[] arr1 = {1, 7, 9, 11};
        int[] arr2= {2, 4, 13, 15};
        int[] arrSorted = new int[8];
        int idA = 3, idB = 3;
        int i = 0, j = 0, k = 0;
        while(i <= idA && j <= idB) {
            if(arr1[i] < arr2[j]) {
                arrSorted[k++] = arr1[i++];
            }
            else {
                arrSorted[k++] = arr2[j++];
            }
        }
        while(i <= idA)
            arrSorted[k++] = arr1[i++];
        while(j <= idB)
            arrSorted[k++] = arr2[j++];
        for(int el: arrSorted) {
            System.out.print(el+ ",");
        }
    }
}
