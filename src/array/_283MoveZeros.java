package array;

public class _283MoveZeros {
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        for (int k = i; k < nums.length; k++){
            nums[k] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
    }
}
