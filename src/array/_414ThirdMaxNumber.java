package array;

import java.util.Arrays;

public class _414ThirdMaxNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int index = -1;
        int max_1st = nums[nums.length-1];
        int max_3st = 0;
        for (int i = nums.length-1; i > 0; i--){
            if (nums[i] != nums[i-1]){
                if (count == 3){
                    break;
                }
                count++;
                index = i-1;
            }
        }
        if (count != 3){
            return max_1st;
        } else {
            return nums[index];
        }
    }

    public int thirdMax2(int[] nums) {
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int num : nums){
            if(num>max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if(max1>num && num>max2){
                max3 = max2;
                max2 = num;
            }else if(max2>num && num>max3){
                max3=num;
            }
        }
        return max3 != Long.MIN_VALUE ? (int) max3 : (int) max1;
    }
}
