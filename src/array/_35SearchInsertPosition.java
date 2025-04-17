//package array;
//
////https://leetcode.com/problems/search-insert-position/description/?envType=problem-list-v2&envId=array
//
//public class _35SearchInsertPosition {
//    public static int searchInsert(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        int mid = left + (right -left)/2;
//
//        while (left < right) { // ==?
//            if (target < nums[mid]){
//                right = mid;
//            } else if (target > nums[mid]){
//                left = mid;
//            } else {
//                return
//            }
//
//        }
//}
