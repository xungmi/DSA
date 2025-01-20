package array;

public class _303RangeSumQuery {
	public static class NumArray {
		private int[] nums;
		public NumArray(int[] nums) {
			this.nums = nums;
		}

		public int sumRange(int left, int right) {
			int sum = 0;
			for (int i = left; i <= right; i++){
				sum += nums[i];
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
		NumArray obj = new NumArray(nums);
		System.out.println(obj.sumRange(0, 5));
	}

}
