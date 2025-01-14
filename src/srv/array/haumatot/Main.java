package srv.array.haumatot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int M, N, numQ, numK, numP;
	static int[][] board;
	static int[] posQ, posK, posP;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("E:\\DSA\\src\\srv\\array\\haumatot\\input.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			System.out.println("M: " + M);
			System.out.println("N: "+ N);
			break;
//			String line = sc.nextLine();
//			char[] posQ_ = line.toCharArray()
//			numQ = sc.nextInt();
//			System.out.println(numQ);
//			System.out.println("#" + (tc + 1) + " " + Arrays.toString(posQ));
		}

		sc.close();
	}
}
