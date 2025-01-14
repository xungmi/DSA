//package srv.array.kiemtrasudoku;
//
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
////#1 1
////#2 0
///*
//Trò chơi sudoku là một trò chơi điền các số từ 1 đến 9 vào ma trận 9x9
//sao cho c ác số không bị trùng lặp trên hàng ngang, hàng dọc và ma trận con 3x3.
//Cho 1 ma trận 9x9 tượng trưng cho 1 đề Sudoku,
//trong đó vị trí của các dấu “.” là vị trí chưa được giải.
//Viết một chương trình kiểm tra tính đúng đắn của một đề sudoku.
//Đề sudoku hợp lệ là không có 2 số trùng nhau trên cùng 1 hàng, 1 cột và ma trận con 3x3.
//Nếu h ợp lệ in ra số 1, không hợp lệ in ra số 0.
// */
//public class Main {
//    static char[][] arr = new char[9][9];
//
//    public static void main(String[] args) throws FileNotFoundException {
//        System.setIn(new FileInputStream("E:\\DSA\\src\\srv\\array\\kiemtrasudoku\\input.txt"));
//
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        sc.nextLine();
//        for (int tc = 0; tc < T; tc++) {
//            int ans = 0;
//            for (int i = 0; i < 9; i++) {
//                String line = sc.nextLine();
//                for (int j = 0; j < 9; j++) {
//                    arr[i][j] = line.charAt(j);
//                }
//            }
//            boolean isValid = isValidSudoku(arr);
//            System.out.println("#" + (tc + 1) + " " + (isValid ? 1 : 0));
//        }
//    }
//
//    static boolean isValidSudoku(char[][] board) {
//        for (int i = 0; i < 9; i++) {
//            if (!isValidRow(board, i) || !isValidCol(board, i) || !isValidSubMat(board, i)) {
//                return false;
//            }
//            return true;
//        }
//    }
//
//    static boolean isValidRow(char[][] board, int i){
//
//    }
//
//
//}
