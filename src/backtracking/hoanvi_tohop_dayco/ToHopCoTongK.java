package backtracking.hoanvi_tohop_dayco;

//Tìm tất cả tổ hợp các số (không trùng lại) có tổng bằng K
//Input: [2, 3, 6, 7], target = 7
//Output: [2, 2, 3], [7]

import java.util.ArrayList;
import java.util.List;

public class ToHopCoTongK {
    static int target = 7;
    static int sum = 0;
    static void backtrack(int[] nums, List<Integer> path, int start){
        if (sum == target){
            System.out.println(path);
            return;
        } else if (sum > target){
            return;
        }

        for (int i = start; i < nums.length; i++){
            path.add(nums[i]);
            sum += nums[i];
            backtrack(nums, path,i+1);
            path.removeLast();
            sum -= nums[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        backtrack(nums, new ArrayList<>(), 0);
    }
}
