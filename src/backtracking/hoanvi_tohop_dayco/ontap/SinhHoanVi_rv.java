package backtracking.hoanvi_tohop_dayco.ontap;

import java.util.ArrayList;
import java.util.List;

public class SinhHoanVi_rv {
    static List<Integer> nums = new ArrayList<>();
    static void backtrack(int[] nums, boolean[] used, List<Integer> path){
        if (path.size() == nums.length){
            System.out.println(path);
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (used[i]) continue;

            used[i] = true;
            path.add(nums[i]);
            backtrack(nums, used, path);
            path.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        boolean[] used = new boolean[4];
        backtrack(nums, used, new ArrayList<>());
    }

}
