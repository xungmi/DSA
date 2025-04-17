package array;

import java.util.Arrays;

public class _806NumberOfLinesToWriteString {
    public static int[] numberOfLines(int[] widths, String s) {
        int countWidthALine = 0;
        int countLines = 1;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int idx = (ch-19)%26;
            int width = widths[idx];

            if (countWidthALine + width <= 100){
                countWidthALine += width;
            } else {
                countWidthALine = width;
                countLines++;
            }
        }
        return new int[]{countLines, countWidthALine};
    }

    public static void main(String[] args) {
        int[] widths = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(numberOfLines(widths, s)));
    }
}
