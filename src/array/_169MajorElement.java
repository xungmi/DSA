   package array;

import java.util.HashMap;

public class _169MajorElement {
    public static int majorityElement(int[] nums) {
        int main = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, 0);
            int count = map.get(num) + 1;
            map.put(num, count);

            if (max < count) {
                max = count;
                main = num;
            }
        }
        return main;
    }
}
