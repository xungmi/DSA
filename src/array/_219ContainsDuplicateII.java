package array;

import java.util.HashMap;

public class _219ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(arr, k));
    }
}
