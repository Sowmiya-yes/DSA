package sorting;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr1 = {7, 4, 1, 8, 5, 2};
        int[] arr1 = {1, 2, 4, 5, 7, 8};
        int temp, pass = 0;
        for(int i = 0; i < arr1.length; i++) {
            pass++;
            for(int j = i+1; j < arr1.length; j++) {
                if(arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(int el: arr1)
            System.out.print(el);
        System.out.println("\n" + pass);
    }
}
