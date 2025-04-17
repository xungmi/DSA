package srv.array.hethongvienthong;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static char[][] arr = new char[100][100];
	static int[][] mark = new int[100][100];
	static int M, N;
	static Scanner sc;
	static HashMap<Character, int[][]> map = new HashMap<>();

	public static void main(String[] args) throws FileNotFoundException {
//		System.setIn(new FileInputStream("D:\\code\\DSA\\src\\srv\\array\\hethongvienthong\\input.txt"));

		sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			M = sc.nextInt();
			N = sc.nextInt();
			sc.nextLine();

			readData();
			System.out.println("#" + (tc + 1) + " " + solve());
		}
	}

	static void readData(){
		for (int i = 0; i < M; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = line.charAt(j);
				if (arr[i][j] == 'H') mark[i][j] = 1;
				else {
					mark[i][j] = 0;
				}
			}
		}
	}

	static int solve(){
		for (int i = 0; i < M; i++){
			for (int j = 0; j < N; j++){
				int step = 0;
				if(arr[i][j] == 'A'){
					step = 1;
				} else if (arr[i][j] == 'B'){
					step = 2;
				} else if (arr[i][j] == 'C'){
					step = 3;
				}
				if(step != 0){
					updateMark(i, j, step);
				}
			}
		}
		return countSum();
	}

	static void updateMark(int r, int c, int step){
		for (int i = 1; i <= step; i++){
			if (r-i >= 0) mark[r-i][c] = 0;
			if (r+i < M) mark[r+i][c] = 0;
			if (c-i >= 0) mark[r][c-i] = 0;
			if (c+i < N) mark[r][c+i] = 0;
		}
	}

	static int countSum(){
		int count = 0;
		for (int i = 0; i < M; i++){
			for (int j = 0; j < N; j++){
				if (mark[i][j] == 1){
					count++;
				}
			}
		}
		return count;
	}

}
