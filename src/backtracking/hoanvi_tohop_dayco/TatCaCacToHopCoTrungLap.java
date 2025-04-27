package backtracking.hoanvi_tohop_dayco;

import java.util.ArrayList;
import java.util.List;

public class TatCaCacToHopCoTrungLap {
    static void backtrack(int[] nums, List<Integer> path){
        if (path.size() == 2){
            System.out.println(path);
            return;
        }

        for (int i = 0 ; i < nums.length; i++){
            path.add(nums[i]);
            backtrack(nums, path);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        backtrack(nums, new ArrayList<>());
    }
}
