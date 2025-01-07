package srv.array;

import java.util.HashSet;
import java.util.Scanner;

public class CountPair {
	static int N, K;
	static int[] arr;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int t = 0; t < T; t++) {
			N = scanner.nextInt();
			K = scanner.nextInt();
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = scanner.nextInt();
			}

			int count = 0;
			HashSet<Integer> seen = new HashSet<>();
			for (int i = 0; i < N; i++){
				if (seen.contains(arr[i] - K)){
					count++;
				}

				if (seen.contains(arr[i] + K)){
					count++;
				}
				seen.add(arr[i]);
			}
			System.out.println(count);
		}
	}
}
