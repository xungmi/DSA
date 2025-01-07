package srv.array.logodoixung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LogoDoiXung {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\array\\logodoixung\\input.txt"));
		Scanner sc = new Scanner(System.in);

		int T, N;
		T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			N = sc.nextInt();
			int[][] arr = new int[N][N];
			boolean ans = true;
			boolean notZero = false;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			outer:
			for (int i = 0; i < N / 2; i++) {
				for (int j = 0; j < N / 2; j++) {
					if (arr[i][j] != arr[i][N - 1 - j]) {
						ans = false;
						break outer;
					}
					if (arr[i][j] != arr[N - 1 - i][j]) {
						ans = false;
						break outer;
					}
					if (arr[i][j] != 0) {
						notZero = true;
					}
				}
			}
			System.out.println("#" + (tc + 1) + " " + (ans && notZero ? "YES" : "NO"));
		}
	}
}
