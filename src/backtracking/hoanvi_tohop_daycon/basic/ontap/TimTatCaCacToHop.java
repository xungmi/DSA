package backtracking.hoanvi_tohop_daycon.basic.ontap;

import java.util.ArrayList;
import java.util.List;

public class TimTatCaCacToHop {
    static void backtrack(int[] nums, int start, List<Integer> path){
        if (path.size() == 2){
            System.out.println(path);
            return;
        }

        for (int i = start; i < nums.length; i++){
            path.add(nums[i]);
            backtrack(nums, i+1, path);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        backtrack(nums, 0, new ArrayList<>());
    }
}
