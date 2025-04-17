//package array;
//
//public class _645SetMisMatch {
//    public int[] findErrorNums(int[] nums) {
//        int n  = nums.length;
//        Arrays.sort(nums);
//        int num1 = 0;
//        int num2 = 0;
//        for (int j = 0; j < n; j++){
//            if (j+1 < nums.length && nums[j] == nums[j+1]){
//                num1 = nums[j];
//                if (num1 == n) {//why
//                    num2 = num1 - 1;
//                } else {
//                    num2 = num1 + 1;
//                }
//            }
//        }
//        return new int[]{num1, num2};
//    }
//}
