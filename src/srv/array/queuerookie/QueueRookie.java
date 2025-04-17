package srv.array;

import java.util.Scanner;

public class QueueRookie {
	static int T;
	static int N;
	static int[] height;
	static int[] num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int i = 0; i < T; i++){
			N = sc.nextInt();
			for (int j = 0; j < N; j++){
				height[i] = sc.nextInt();
			}

			for (int j = 0; j < N; j++){
				num[i] = sc.nextInt();
			}

		}
	}
}
