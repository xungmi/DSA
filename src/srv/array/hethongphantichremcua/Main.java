package srv.array.hethongphantichremcua;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\array\\hethongphantichremcua\\input.txt"));

		int T, M, N;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			sc.nextLine();
			int rows = 5 * M + 1;
			int cols = 5 * N + 1;
			char[][] arr = new char[rows][cols];
			int[] types = new int[5];
			for (int i = 0; i < rows; i++) {
				String line = sc.nextLine();
				for (int j = 0; j < cols; j++) {
					arr[i][j] = line.charAt(j);
				}
			}

			for (int i = 1; i <= M; i++) {
				for (int j = 1; j <= N; j++) {
					int type = checkToa(arr, i, j);
					types[type] += 1;
				}
			}

			System.out.println("#" + (tc + 1) + " " + types[0] + " " + types[1] + " " + types[2] + " " + types[3] + " "
					+ types[4]);
		}
	}

	static int checkToa(char[][] arr, int i, int j) {
		int type = 0;
		//check row1
		if (arr[5 * i - 4][5 * j - 4] == '.') {
			type = 0;
		} else {
			if (arr[5 * i - 3][5 * j - 4] == '.') {
				type = 1;
			} else {
				if (arr[5 * i - 2][5 * j - 4] == '.') {
					type = 2;
				} else {
					if (arr[5 * i - 1][5 * j - 4] == '.') {
						type = 3;
					} else {
						type = 4;
					}
				}
			}
		}
		return type;
	}
}
