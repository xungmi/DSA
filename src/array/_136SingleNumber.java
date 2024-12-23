package array;

public class _136SingleNumber {
	//time O(n)
	// space O(1)

	public int singleNumber(int[] nums) {
		if (nums.length == 1){
			return nums[0];
		}

		int i = 0;
		int j = 1;
		boolean flag = false;

		while (j < nums.length && i < nums.length) {

			if (nums[j] == nums[i]) {
				i++;
				j = i + 1;
				flag = true;
			} else {
				j++;
			}

			if (j == nums.length - 1 && !flag) {
				return nums[i];
			}
		}

		return i;
	}
}
