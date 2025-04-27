package backtracking.hoanvi_tohop_daycon.basic.ontap;

import java.util.Arrays;

public class N_Queens {
	static int n = 4;

	static boolean is_safe(int[] board, int row, int col){
		for (int i = 0; i < row; i ++){
			if (board[i] == col || board[i] - i == col - row ||  board[i] + i == row + col){
				return false;
			}
		}
		return true;
	}
	static void backtrack(int[] board, int row){
		if (row == n){
			System.out.println(Arrays.toString(board));
			return;
		}

		for (int col = 0; col < n; col++){
			if (is_safe(board, row, col)){
				board[row] = col;
				backtrack(board, row+1);
				board[row] = -1;
			}
		}
	}

	public static void main(String[] args) {
		int[] board = new int[n];
		Arrays.fill(board, -1);
		backtrack(board, 0);
	}
}
