package Day1;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_end = arr[0], max_so_far = arr[0];
        for(int i = 1; i < arr.length; i++) {
            max_end = Math.max(max_end +  arr[i], arr[i]);
            max_so_far = Math.max(max_end, max_so_far);
        }
        System.out.println(max_so_far);
    }
}
