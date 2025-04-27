package backtracking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MeCung {
	/*
	Co 1 ma tran 2D, moi gia tri la 0 : wall hoac 1 way
	Yeu cau: Tìm một đường đi (hoặc tất cả các đường đi) từ điểm xuất phát đến đích trong mê cung.

	Y tuong:
		- Bắt đầu từ ô xuất phát X, Y
		- Tai moi buoc, tu vi tri hien tai:
			- Xem 4 huong (len, xuong, trai, phai)
			- Neu o tiep theo:
				- Nam trong bien me cung
				- Chua di qua
				- ko phai tuong
			- Di tiep den o do
		- Neu toi dich => in ra duong di thanh cong
	 */

	static int[][] meCung = new int[][]{
			{1, 1, 1, 1},
			{1, 0, 0, 1},
			{1, 0, 0, 1},
			{1, 1, 1, 1}
	};

	static int n = meCung.length;
	static boolean[][] visited = new boolean[n][n];
	static int targetX = 3;
	static int targetY = 3;

	static int[][] directions = {
			{-1, 0}, // đi lên
			{1, 0},  // đi xuống
			{0, 1},  // đi phải
			{0, -1}  // đi trái
	};

	static void backtrack(int x, int y, String path){
		if (x == targetX && y == targetY){
			System.out.println(path);
			return;
		}

		for (int[] direct : directions){
			int nx = x + direct[0];
			int ny = y + direct[1];

			if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
			if (meCung[nx][ny] == 0) continue;
			if (visited[nx][ny]) continue;

			visited[nx][ny] = true;
			backtrack(nx, ny, path + " => (" + nx + ", " + ny + ")");
			visited[nx][ny] = false;
		}
	}

	public static void main(String[] args) {
		visited[0][0] = true;
		backtrack(0, 0, "(0, 0)");
	}
}
