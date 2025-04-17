package array;

import java.util.Arrays;

public class _832FlippingImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image.length/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][image.length-1-j]==0?1:0;
                image[i][image.length-1-j] = temp==0?1:0;
            }
        }
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image.length; j++){
                image[i][j] = image[i][j]==0?1:0;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{
                {1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}
        };
        flipAndInvertImage(image);
    }
}
