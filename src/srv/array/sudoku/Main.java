package srv.array.sudoku;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static char[][] board = new char[9][9];
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\array\\sudoku\\input.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int tc = 0; tc < T; tc++) {
			for (int i = 0; i < 9; i++) {
				String line = sc.nextLine();
				for (int j = 0; j < 9; j++) {
					board[i][j] = line.charAt(j);
				}
			}
			System.out.println("#" + (tc + 1) + " " + (isBoardValid(board) ? 1 : 0));
		}
		sc.close();
	}

	public static boolean isBoardValid(char[][] board) {
		for (int i = 0; i < 9; i++) {
			if (!isRowValid(board, i) || !isColValid(board, i) || !isSubMatValid(board)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isRowValid(char[][] board, int r) {
		HashSet<Character> set = new HashSet<Character>();
		char[] row = board[r];
		for (int i = 0; i < 9; i++) {
			if (row[i] != '.') {
				boolean isNotDuplicate = set.add(row[i]);
				if (!isNotDuplicate) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isColValid(char[][] board, int c) {
		HashSet<Character> set = new HashSet<Character>();
		char[] colum = new char[9];

		for (int i = 0; i < 9; i++) {
			colum[i] = board[i][c];
			if (colum[i] != '.') {
				boolean isNotDuplicate = set.add(colum[i]);
				if (!isNotDuplicate) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isSubMatValid(char[][] board) {
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				HashSet<Character> setGrid = new HashSet<Character>();
				for (int m = i; m < i + 3; m++) {
					for (int n = j; n < j + 3; n++) {
						if (board[m][n] != '.') {
							boolean isNotDuplicate = setGrid.add(board[m][n]);
							if (!isNotDuplicate) {
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}

}
