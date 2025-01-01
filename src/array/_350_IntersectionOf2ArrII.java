package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _350_IntersectionOf2ArrII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int num : nums1){
            if (map1.containsKey(num)){
                map1.put(num, map1.get(num) + 1);
            } else {
                map1.putIfAbsent(num, 1);
            }
        }
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums2){
            if (map2.containsKey(num)){
                map2.put(num, map2.get(num) + 1);
            } else {
                map2.putIfAbsent(num, 1);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()){
            if ( map2.containsKey(entry.getKey())){
                int num_duplicate = (map2.get(entry.getKey()) < entry.getValue())? map2.get(entry.getKey()) : entry.getValue();
                for (int i =0; i < num_duplicate; i++){
                    arr.add(entry.getKey());
                }
            }
        }

        int i = 0;
        int[] result = new int[arr.size()];
        for (int num : arr){
            result[i++] = num;
        }
        return result;
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i =0, j =0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i < l1 && j < l2){
            if (nums1[i] < nums2[j]){
                i++;
            } else if (nums1[i] > nums2[j]){
                j++;
            } else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
