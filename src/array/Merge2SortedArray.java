package array;

import java.util.Arrays;

public class Merge2SortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //https://leetcode.com/problems/merge-sorted-array/solutions/3436053/beats-100-best-c-java-python-and-javascript-solution-two-pointer-stl/?envType=problem-list-v2&envId=array
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if (i >= 0 && nums2[j] < nums1[i]){
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1, 3, nums2, nums2.length);
    }
}
