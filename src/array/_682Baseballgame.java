package array;

import java.util.ArrayList;
import java.util.stream.Stream;

public class _682Baseballgame {
    public static int calPoints(String[] operations) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String s : operations){
            switch (s){
                case "+":
                    if (arrayList.size() >= 2){
                        int v1 = arrayList.getLast();
                        int v2 = arrayList.get(arrayList.size()-2);
                        arrayList.add(v1+v2);
                    }
                    break;
                case "D":
                    int val = arrayList.getLast();
                    arrayList.add(val*2);
                    break;
                case "C":
                    arrayList.removeLast();
                    break;
                default:
                    int value = Integer.parseInt(s);
                    arrayList.add(value);
                    break;
            }
        }
        int sum = 0;
        for (int v : arrayList){
            sum += v;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] op = new String[]{
                "5","2","C","D","+"
        };
        System.out.println(calPoints(op));
    }
}
