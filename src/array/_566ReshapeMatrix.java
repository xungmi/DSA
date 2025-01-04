//package array;
//
//import java.util.Arrays;
//
//public class _566ReshapeMatrix {
//	public static int[][] matrixReshape(int[][] mat, int r, int c) {
//		int m = mat.length;
//		int n = mat[0].length;
//
//		if (m * n != r*c){
//			return mat;
//		}
//
//		int[][] ans = new int[r][c];
//
//		int[] flatMat = new int[m*n];
//
//		for (int i = 0; i < m; i ++){
//			for (int j = 0; j < n; j++){
//				flatMat[i+j] = mat[i][j];
//			}
//		}
//		System.out.println(Arrays.toString(flatMat));
//		return mat;
//	}
//
//	public static void main(String[] args) {
//		int[][] mat = new int[][]{
//				{1,2},
//				{3,4}
//		};
//		int r = 1;
//		int c = 4;
//		matrixReshape(mat, r, c);
//	}
//}
