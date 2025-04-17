package math;

import java.util.Stack;

public class _292NimGame {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        int num_ = Math.abs(num);
        StringBuilder builder = new StringBuilder();
        while (num_ > 0){
            int phanDu = num_%7;
            builder.append(phanDu);
            num_ /= 7;
        }
        builder.reverse();

        if (num < 0) {
            builder.append("-");
        }
        return num < 0? "-" + builder : builder.toString();
    }
}
