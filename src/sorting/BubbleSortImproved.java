package sorting;

public class BubbleSortImproved {
    public static void main(String[] args) {
//        int[] arr1 = {7, 1, 8, 4, 5, 2};
        int[] arr1 = {1, 2, 4, 5, 7, 8};
        int temp, pass = 0, last = arr1.length - 1;
        boolean swapped = true;
        while(swapped) {
            pass++;
            swapped = false;
            for (int i = 0; i < last; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                    swapped = true;
                }
            }
            last--;
        }
        for(int el: arr1)
            System.out.print(el);
        System.out.println("\n" + pass);
    }
}
