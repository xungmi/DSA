package array;

public class _896MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        boolean isInc = false;
        boolean isDec = false;

        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] < nums[i+1]){
                isInc = true;
            }

            if (nums[i] > nums[i+1]){
                isDec = true;
            }

            if (isInc && isDec){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3,2,2,3};
        System.out.println(isMonotonic(nums));
    }
}
