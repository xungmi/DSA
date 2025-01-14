package array;

import java.util.Arrays;

public class _2418SortThePeople {
    public static void main(String[] args) {
        sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170});
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    int temp = heights[i];
                    String temp2 = names[i];
                    heights[i] = heights[j];
                    names[i] = names[j];
                    heights[j] = temp;
                    names[j] = temp2;
                }
            }
        }
        return names;
    }
}
