package week1;

public class FloodFill {

    static void recursiveFloodFill(int[][] image, int sr, int sc, int rows, int cols, int color, int newColor) {
        if(sr < 0 || sc < 0 || sr >= rows || sc >= cols)
            return;
        if(image[sr][sc] != color)
            return;
        image[sr][sc] = newColor;
        recursiveFloodFill(image, sr+1, sc, rows, cols, color, newColor);
        recursiveFloodFill(image, sr-1, sc, rows, cols, color, newColor);
        recursiveFloodFill(image, sr, sc+1, rows, cols, color, newColor);
        recursiveFloodFill(image, sr, sc-1, rows, cols, color, newColor);
    }

    static void displayFill(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        int color = image[sr][sc];
        if(image[sr][sc] == newColor) {
            displayFill(image);
            System.exit(0);
        } else {
            recursiveFloodFill(image, sr, sc, image.length, image[0].length, color, newColor);
            displayFill(image);
        }
    }
}
