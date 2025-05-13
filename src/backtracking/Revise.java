package backtracking;

import java.util.Arrays;

public class Revise {
	static int count = 0;

	static boolean is_safe(int[] board, int row, int col){
		for (int i = 0; i < row; i++){
			if (board[i] == col || row - i == Math.abs(col - board[i])){
				return false;
			}
		}
		return true;
	}
	static void backtrack(int[] board, int row, int n){
		if (row == n){
			System.out.println(Arrays.toString(board));
			count++;
			return;
		}

		for (int col = 0; col < n; col++){
			if (is_safe(board, row, col)){
				board[row] = col;
				backtrack(board, row+1, n);
				board[row] = -1;
			}
		}
	}

	public static void main(String[] args) {
		int n = 8;
		int[] board = new int[n];
		Arrays.fill(board, -1);
		backtrack(board, 0, n);
		System.out.println("So nghiem : " + count);
	}
}
