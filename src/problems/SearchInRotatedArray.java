package problems;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int left = 0, right = arr.length - 1, mid, toSearch = 3;

        while(left <=  right) {
            mid = (left + right) / 2;
            if (arr[mid] == toSearch) {
                System.out.println(mid);
                return;
            }
            if(arr[mid] > arr[left]) {
                if(toSearch < arr[mid] && toSearch >= arr[left])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if(toSearch > arr[mid] && toSearch <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
