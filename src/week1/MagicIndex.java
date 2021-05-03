package week1;

public class MagicIndex {
    public static void main(String[] args) {
        int[] arr = { -10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
        int left = 0, right = arr.length - 1;

        System.out.println(binarySearch(left, right, arr));
    }

    private static int binarySearch(int left, int right, int[] arr) {
        if(left <= right) {
            int mid = (left + right) / 2;
            System.out.println(left + " " + right + " " + mid);
            if(arr[mid] == mid)
                return mid;
//            else if( mid < arr[mid])
//                return binarySearch(left, mid - 1), arr);
//            else
//                return binarySearch(mid + 1, right, arr);
            int leftSide = binarySearch(left, Math.min(mid - 1, arr[mid]), arr);
            if(leftSide >= 0)
                return leftSide;
            return binarySearch(Math.max(mid + 1, arr[mid]), right, arr);
        }
        return -1;
    }
}
