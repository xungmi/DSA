package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class _2032TwoOutOfThree {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        for (int num : nums3) {
            set3.add(num);
        }

        HashSet<Integer> setAns = new HashSet<>();
        for (int val : set1) {
            if (set2.contains(val) || set3.contains(val)) {
                setAns.add(val);
            }
        }

        for (int val : set2) {
            if (set3.contains(val)) {
                setAns.add(val);
            }
        }
        return new ArrayList<>(setAns);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,1,3,2};
        int[] nums2 = new int[]{2,3};
        int[] nums3 = new int[]{3};
        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }
}
