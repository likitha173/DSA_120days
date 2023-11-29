import java.util.*;

public class FloodFillAlgo {
    public static void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgColor) {
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgColor){
            return;
        }

        image[sr][sc] = color;
        vis[sr][sc] = true;
        helper(image, sr, sc-1, color, vis, orgColor);
        helper(image, sr, sc+1, color, vis, orgColor);
        helper(image, sr-1, sc, color, vis, orgColor);
        helper(image, sr+1, sc, color, vis, orgColor);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1,}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        
        int[][] result = floodFill(image, sr, sc, color);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
