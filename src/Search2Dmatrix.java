package Day1;

public class Search2Dmatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 55;
//        boolean rowReached = false;
//        int rowNum = 0;
//        while(!rowReached && (rowNum < matrix.length)) {
//            if(matrix[rowNum][matrix[0].length - 1] >= target) {
//                rowReached = true;
//                break;
//            }
//            rowNum++;
//        }
//        if(rowReached) {
//            for(int i = 0; i < matrix[0].length; i++) {
//                if(matrix[rowNum][i] == target)
//                    return true;
//            }
//            return false;
//        } else {
//            return false;
//        }

        boolean found = false;
        int low = 0, high = (matrix.length * matrix[0].length) - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(matrix[mid/matrix[0].length][mid/matrix.length] == target) {
                found = true;
                break;
            } else if (matrix[mid/matrix[0].length][mid/matrix.length] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(found ? "True" : "false");
    }
}
