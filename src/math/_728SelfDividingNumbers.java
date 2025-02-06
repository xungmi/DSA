package math;

import java.util.ArrayList;
import java.util.List;

public class _728SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for_loop:
        for (int num = left; num <= right; num++){
            int num_ = num;
            boolean flag = true;
            while (num_ > 0){
                int ld = num_%10;
                if (ld == 0){
                    continue for_loop;
                }
                if (num%ld!=0){
                    flag = false;
                    break;
                }
                num_ /= 10;
            }
            if (flag){
                list.add(num);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(47, 85));
    }
}
