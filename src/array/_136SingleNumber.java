package array;

//https://leetcode.com/problems/single-number/description/
public class _136SingleNumber {
	//time O(n)
	// space O(1)

	public int singleNumber(int[] nums) {
		int result = 0;
		for (int num : nums){
			result ^= num;
		}

		return result;
	}
}
