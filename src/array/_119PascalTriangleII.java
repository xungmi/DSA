package array;

import java.util.ArrayList;
import java.util.List;

public class _119PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of(1)));
        if (rowIndex == 0){
            return list.getFirst();
        }
        list.add(new ArrayList<>(List.of(1,1)));
        if (rowIndex == 1){
            return list.get(rowIndex);
        }

        for (int row = 2; row <= rowIndex; row++){
            List<Integer> preList = list.get(row-1);
            List<Integer> tempList = new ArrayList<>();
            tempList.add(1);
            for (int i = 0; i < preList.size()-1; i++){
                tempList.add(preList.get(i) + preList.get(i + 1));
            }
            tempList.add(1);
            list.add(tempList);
        }
        return list.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
}
