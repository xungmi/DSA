package backtracking;

import java.util.ArrayList;
import java.util.List;

public class SinhHoanVi {
	static List<Integer> nums = new ArrayList<>();
	static void backtracking(int[] nums, List<Integer> path, boolean[] used){
		if (path.size() == nums.length) {
			System.out.println(path);
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i]) continue;

			used[i] = true;
			path.add(nums[i]);
			backtracking(nums, path, used);
			path.removeLast();
			used[i] = false;
		}
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		boolean[] used = new boolean[nums.length];
		backtracking(nums, new ArrayList<>(), used);
	}
}
