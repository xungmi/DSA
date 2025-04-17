package array;

import java.util.HashSet;
import java.util.Set;

public class _349IntersectionOf2Arr {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1){
            set.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2){
            if (set.contains(num)){
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num :  intersection) {
            result[i++] = num;
        }
        return result;
    }
}
