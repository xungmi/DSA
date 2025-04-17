package array;

public class _303RangeSumQuery {
	public static class NumArray {
		private int[] prefixSum;
		//goi it lan => tang cuong tinh toan o ham nay
		public NumArray(int[] nums) {
			for (int i = 1; i < nums.length; i++){
				nums[i] = nums[i] + nums[i-1];
			}
			prefixSum = nums;
		}

		//goi nhieu lan => Han che tinh toan o ham nay
		public int sumRange(int left, int right) {
			return left==0?prefixSum[right] : prefixSum[right]-prefixSum[left-1];
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
		NumArray obj = new NumArray(nums);
		System.out.println(obj.sumRange(0, 5));
	}

}
