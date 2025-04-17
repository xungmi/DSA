package array;

import java.util.*;

public class _448FindAllNumbersDisappearedInAnArray {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length;

		List<Integer> list = new ArrayList<>();
		for (int i =0; i < n; i++){
			int index;
			if (nums[i] < 0){
				index = -nums[i] - 1;
			} else {
				index = nums[i] - 1;
			}

			if (nums[index] > 0){
				nums[index] = -nums[index];
			}
		}

		for (int i = 0; i < n; i++){
			if (nums[i] > 0){
				list.add(i+1);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,1};
		System.out.println(findDisappearedNumbers(nums));
	}
}
