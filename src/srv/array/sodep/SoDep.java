package srv.array.sodep;

import java.util.Scanner;

public class SoDep {
	static int N, M, x, y;
	static int[] arr;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int tc = 0; tc < T; tc++) {
			N = scanner.nextInt();
			M = scanner.nextInt();

			for(int i = 0; i < N; i++){
				arr[i] = scanner.nextInt();
			}
			x = scanner.nextInt();
			y = scanner.nextInt();

			int count = 0;//so luong ma san pham thoa man



			System.out.println("#" + tc +" " + count);
		}
	}
}
