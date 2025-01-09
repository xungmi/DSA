package srv.array.vuotchuongngaivat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("E:\\DSA\\src\\srv\\array\\vuotchuongngaivat\\input.txt"));

        int T, N, x, y;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            N = sc.nextInt();
            int[][] arr = new int[N][N];
            x = sc.nextInt();
            y = sc.nextInt();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int count = 0;
            boolean flag = true;
            while (flag) {
                int[] newPosition = findNext(arr, x, y);
                if (newPosition[0] != -1) {
                    x = newPosition[0];
                    y = newPosition[1];
                    count++;
                } else {
                    flag = false;
                }
            }
            System.out.println("#" + (tc + 1) + " " + count);
        }
    }

    public static int[] findNext(int[][] arr, int x, int y) {
        int size = arr.length;
        int valueAtCurrentPos = arr[x][y];
        int[] nextPosition = new int[]{-1, -1};
        int minOfLargerNum = Integer.MAX_VALUE;
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] direction : directions) {
            int x_new = x + direction[0];
            int y_new = y + direction[1];
            if (x_new < size &&
                    x_new >= 0 &&
                    y_new >= 0 &&
                    y_new < size) {
                int valueOfPosNew = arr[x_new][y_new];
                if (valueOfPosNew > valueAtCurrentPos && valueOfPosNew < minOfLargerNum) {
                    minOfLargerNum = valueOfPosNew;
                    nextPosition[0] = x_new;
                    nextPosition[1] = y_new;
                }
            }
        }
        return nextPosition;
    }
}
