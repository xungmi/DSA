package srv.array.hethongvienthong;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static char[][] arr;
	static int M, N;
	static int[][] directionsOfA = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	static int[][] directionsOfB = {{-1, 0}, {-2, 0}, {1, 0}, {2, 0}, {0, -2}, {0, -1}, {0, 1}, {0, 2}};
	static int[][] directionsOfC = {{-1, 0}, {-2, 0}, {-3, 0}, {1, 0}, {2, 0}, {3, 0}, {0, -3}, {0, -2}, {0, -1}, {0,
			1}, {0, 2}, {0, 3}};

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\array\\hethongvienthong\\input.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			sc.nextLine();
			arr = new char[M][N];
			int count = 0;
			for (int i = 0; i < M; i++) {
				String line = sc.nextLine();
				System.out.println(line);
				for (int j = 0; j < N; j++) {
					arr[i][j] = line.charAt(j);
				}
			}

			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					checkBaoPhu(i, j);
				}
			}

			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 'H') {
						count++;
					}
				}
			}
			System.out.println(Arrays.deepToString(arr));

			System.out.println("#" + (tc + 1) + " " + count);
		}
	}

	static void checkBaoPhu(int x, int y) {
		char ch = arr[x][y];
		if (ch == 'A') {
			for (int[] direction : directionsOfA) {
				if (x + direction[0] >= 0 && x + direction[0] < M && y + direction[1] >= 0 && y + direction[1] < N) {
					if (arr[x + direction[0]][y + direction[1]] == 'B'){

					}

					arr[x + direction[0]][y + direction[1]] = 'X';
				}
			}
		} else if (ch == 'B') {
			for (int[] direction : directionsOfB) {
				if (x + direction[0] >= 0 && x + direction[0] < M && y + direction[1] >= 0 && y + direction[1] < N) {
					arr[x + direction[0]][y + direction[1]] = 'X';
				}
			}
		} else if (ch == 'C') {
			for (int[] direction : directionsOfC) {
				if (x + direction[0] >= 0 && x + direction[0] < M && y + direction[1] >= 0 && y + direction[1] < N) {
					arr[x + direction[0]][y + direction[1]] = 'X';
				}
			}
		}
	}

	static void checkBaoPhuOfChar(int[][] directionsOfChar, int x, int y){

	}

}
