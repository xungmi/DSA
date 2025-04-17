package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class _118PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of(1)));
        if (numRows == 1){
            return list;
        }
        list.add(new ArrayList<>(List.of(1,1)));
        if (numRows == 2){
            return list;
        }

        for (int row = 3; row <= numRows; row++){
            List<Integer> preList = list.get(row-2);
            List<Integer> tempList = new ArrayList<>();
            tempList.add(1);
            for (int i = 0; i < preList.size()-1; i++){
                tempList.add(preList.get(i) + preList.get(i + 1));
            }
            tempList.add(1);
            list.add(tempList);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));

    }
}
