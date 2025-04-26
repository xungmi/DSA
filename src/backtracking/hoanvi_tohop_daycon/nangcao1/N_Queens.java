package backtracking.hoanvi_tohop_daycon.nangcao1;

import java.util.Arrays;

/*
Đặt N quân hậu trên bàn cờ NxN sao cho
 không có hai quân hậu nào tấn công lẫn nhau.

Ý tưởng: Đặt quân hậu theo từng hàng, kiểm tra xem vị trí có hợp lệ ko.
Nếu có, tiếp tục đặt ở hàng tiếp theo
Input: có n quân hậu
Output: các cách đặt n quân hậu

implement: board để luu vi tri các quan hau

*/
/*
chéo chính: trên trái xuống dui phải
chéo phụ: trên phải xuống dưới trái
 */
public class N_Queens {
    static int count = 0;
    static boolean is_safe(int[] board, int row, int col){
        //kiểm tra tính hợp lệ của vị trí (row, col)
        for (int i=0; i < row; i++){
            //Nếu trùng cột, trùng đường chéo chính và đường chéo phụ với các hàng trước đó
            if (board[i] == col || board[i] + i == col + row || i - board[i] == row - col){
                return false;
            }
        }
        return true;
    }
    static void backtrack(int[] board, int row, int n){
        if (row == n){
            System.out.println(Arrays.toString(board));
            count ++;
            return;
        }

        //Thử từng cột trong hàng hiện tại
        for (int col = 0; col < n; col++){
            if (is_safe(board, row, col)){
                board[row] = col;
                backtrack(board, row + 1, n);
                board[row] = -1;
            }
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int[] board = new int[n];
        Arrays.fill(board, -1);
        backtrack(board, 0 , n);
        System.out.println("Số nghiệm: " + count);
    }
}

