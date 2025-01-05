package array;

import java.util.Arrays;

public class _566ReshapeMatrix {
	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int m = mat.length;
		int n = mat[0].length;

		if (m * n != r*c){
			return mat;
		}

		int[][] ans = new int[r][c];
		int row_count = 0;
		int col_count = 0;

		int i = 0;
		int j = 0;
		while (i < m){
			ans[row_count][col_count] = mat[i][j];
			col_count++;
			j++;
			if (j == n){
				j = 0;
				i++;
			}

			if (col_count == c){
				col_count = 0;
				row_count ++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[][] mat = new int[][]{
				{1,2},
				{3,4}
		};
		int r = 1;
		int c = 4;
		matrixReshape(mat, r, c);
	}
}
