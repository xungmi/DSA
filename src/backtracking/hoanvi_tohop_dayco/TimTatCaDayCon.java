package backtracking.hoanvi_tohop_dayco;

import java.util.ArrayList;
import java.util.List;

public class TimTatCaDayCon {
    static void backtrack(int[] nums, List<Integer> path, int start) {
        System.out.println(path);

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, path, i + 1);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        backtrack(nums, new ArrayList<>(), 0);
    }
}
