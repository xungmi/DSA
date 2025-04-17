package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _15_3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        int i = 0;
        int j = i + 1;
        int k = j + 1;
        Set<Set<Integer>> setInt = new HashSet<>();
        while (i < nums.length - 2 || j < nums.length - 1) {
            if (k < nums.length) {
                if (nums[i] + nums[j] + nums[k] == 0){
                    Set<Integer> set = new HashSet<>();
                    set.add(nums[i]);
                    set.add(nums[j]);
                    set.add(nums[k]);
                    setInt.add(set);
                }
                k++;
            } else {
                if (j < nums.length-1){
                    j++;
                    k = j+1;
                } else {
                    if (i < nums.length-2){
                        i++;
                        j = i+1;
                        k = j+1;
                    }
                }
            }
        }
        //https://leetcode.com/problems/3sum/description/?envType=problem-list-v2&envId=two-pointers
        return setInt.stream()
                .map(ArrayList::new)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}
