package srv.array.sodep;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SoDep {
	static int N, M, x, y;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\array\\sodep\\input.txt"));
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();

		for (int tc = 0; tc < T; tc++) {
			N = scanner.nextInt(); // Số lượng các số đẹp
			M = scanner.nextInt(); // Số lượng số đẹp cần có trong mã sản phẩm

			Set<Character> beautifulDigits = new HashSet<>();
			for (int i = 0; i < N; i++) {
				beautifulDigits.add(scanner.next().charAt(0));
			}
			x = scanner.nextInt();
			y = scanner.nextInt();

			int count = 0;//so luong ma san pham thoa man

			for (int i = x; i <= y; i++) {
				String numStr = String.valueOf(i);
				int beautifulCount = 0;

				for (char ch : numStr.toCharArray()) {
					if (beautifulDigits.contains(ch)) {
						beautifulCount++;
					}
				}

				if (beautifulCount >= M) {
					count++;
				}
			}
			System.out.println("#" + (tc + 1) + " " + count);
		}
	}
}
