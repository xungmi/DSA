package array;

import java.util.Arrays;

public class _496NextGreaterElement1 {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		int[] ans = new int[nums1.length];

		while (i < nums1.length) {
			if (j < nums2.length && nums2[j] != nums1[i]) {
				j++;
			} else {
				if (j != nums2.length-1){
					for (int k = j + 1; k < nums2.length; k++) {
						if (nums2[k] > nums2[j]) {
							ans[i] = nums2[k];
							break;
						}

						if (k == nums2.length - 1) {
							ans[i] = -1;
						}
					}
				} else {
					ans[i] = -1;
				}

 				i++;
				j = 0;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums1 = new int[]{4,1,2};
		int[] nums2 = new int[]{1,3,4,2};
		System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
	}


}
