package array;

import java.util.Arrays;

public class _217ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++){
			if (nums[i] == nums[i+1]){
				return true;
			}
		}
		return false;
	}
}
