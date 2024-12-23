package array;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int range = nums.length;

		int sum = range * (range + 1) / 2;
		int sumArr = 0;
		for (int num : nums){
			sumArr += num;
		}

		return sum-sumArr;
	}


}
