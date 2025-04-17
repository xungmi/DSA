package srv.array.vungbaolonnhat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int M, N, W, H;
	static int[][] arr;

	public static void main(String[] args) throws java.lang.Exception {
		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\array\\vungbaolonnhat\\input.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			H = sc.nextInt();
			W = sc.nextInt();
			M = sc.nextInt();
			N = sc.nextInt();
			arr = new int[M][N];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			System.out.println("#" + (tc + 1) + " " + solve());
		}

		sc.close();
	}

	static int solve() {
		int max = 0;
		int m = 0;
		int n = 0;
		while (m + H - 1< M && n + W - 1< N) {
			int sum = 0;
			for (int i = 0; i < W; i++) {
				if (arr[m][n+i] % 2 == 0) {
					sum += arr[m][n+i];
				}
				if (arr[m+H-1][n+i] % 2 == 0) {
					sum += arr[m+H-1][n+i];
				}
			}
			for (int i = 1; i < H-1; i++) {
				if (arr[m+i][n] % 2 == 0) sum += arr[m+i][n];

				if (arr[m+i][n+W-1] % 2 == 0) sum += arr[m+i][n+W-1];
			}


			max = Math.max(max,  sum);
			n++;
			if (n+W-1>=N) {
				n = 0;
				m++;
			}
		}
		return max;
	}
}