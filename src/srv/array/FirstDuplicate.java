package srv.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicate {
	static int T;
	static int N;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int tc = 0; tc < T; tc++){
			N = sc.nextInt();
			int[] arr = new int[N];
			for (int j = 0; j < N; j++){
				arr[j] = sc.nextInt();
			}
			int ans = -1;
			HashSet<Integer> set = new HashSet<>();
			for (int j = 0; j < N; j++){
				if(set.contains(arr[j])){
					ans = arr[j];
					break;
				}
				set.add(arr[j]);
			}
			System.out.println("#" + (tc+1) + " " + ans);
		}
	}
}
