package srv.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class XayThap {
	public static void main(String[] args){ //throws FileNotFoundException {
//		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\array\\sodep\\input.txt"));
		int T, N, M1, M2;
		Scanner sc = new Scanner(System.in);
		T= sc.nextInt();

		for (int tc = 0; tc < T; tc++){
			N = sc.nextInt();
			M1 = sc.nextInt();
			M2 = sc.nextInt();

			int[] arr = new int[N];
			for (int i= 0; i < N; i++){
				arr[i] = sc.nextInt();
			}

			int chiPhi = 0;
			Arrays.sort(arr);
			int m1 = 1;
			int m2 = 1;
			int idx = N-1;

			while(m1 <= M1 || m2 <= M2 || idx >= 0){
				if (m1 <= M1){
					chiPhi += arr[idx]*m1;
					idx--;
					m1++;
				}
				if (m2 <= M2){
					chiPhi += arr[idx]*m2;
					m2++;
					idx--;
				}
			}
			System.out.println("#" + (tc+1) + " " + chiPhi);
		}
	}
}
