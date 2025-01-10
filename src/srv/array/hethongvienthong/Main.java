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
	static HashMap<Character, int[][]> map = new HashMap<>();

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\array\\hethongvienthong\\input.txt"));

		map.put('A', new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}});
		map.put('B', new int[][]{{-1, 0}, {-2, 0}, {1, 0}, {2, 0}, {0, -2}, {0, -1}, {0, 1}, {0, 2}});
		map.put('C', new int[][]{{-1, 0}, {-2, 0}, {-3, 0}, {1, 0}, {2, 0}, {3, 0}, {0, -3}, {0, -2}, {0, -1}, {0,
				1}, {0, 2}, {0, 3}});
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			sc.nextLine();
			arr = new char[100][100];
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
			System.out.println("#" + (tc + 1) + " " + count);
		}
	}

	static void checkBaoPhu(int x, int y) {
		char ch = arr[x][y];
		if (map.containsKey(ch)) {
			for (int[] direction : map.get(ch)) {
				if (x + direction[0] >= 0 && x + direction[0] < M && y + direction[1] >= 0 && y + direction[1] < N) {
					if (!map.containsKey(arr[x + direction[0]][y + direction[1]])) {
						arr[x + direction[0]][y + direction[1]] = 'X';
					}
				}
			}
		}
	}
}
