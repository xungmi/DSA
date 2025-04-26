package backtracking.hoanvi_tohop_daycon.basic;

import java.util.ArrayList;
import java.util.List;

public class SinhDayNhiPhanDoDaiN {
    static void backtrack(int n, List<Integer> path, int[] nums){
        if (path.size() == n){
            System.out.println(path);
            return;
        }

        for (int i : nums){
            path.add(i);
            backtrack(n, path, nums);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        backtrack(3, new ArrayList<>(), new int[]{0,1});
    }
}
