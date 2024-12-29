package array;

//cho mảng int nums và số nguyên val
//remove all occurences of val trong nums in-place
//trả về số phần tử trong nums khác val

//số phần tử # val là k
// k phần tử đầu tiên của num là khác val

//https://leetcode.com/problems/remove-element/description/?envType=problem-list-v2&envId=array

import java.util.ArrayList;
import java.util.List;

public class RemoveElement27 {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int num : nums){
            if (num != val){
                nums[i] = num;
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        System.out.println(RemoveElement27.removeElement(nums, 2));
    }
}
