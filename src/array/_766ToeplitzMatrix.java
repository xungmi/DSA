package array;

public class _766ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[][]{
                {1,1}, {2,2}
        };
        System.out.println(isToeplitzMatrix(mat));
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //row
        for (int i = 0; i < n; i ++){
            boolean result = deQuy(matrix, 0, i);
            if (!result){
                return false;
            }
        }
        for (int i = 0; i < m; i++){
            boolean result = deQuy(matrix, i, 0);
            if (!result){
                return false;
            }
        }
        return true;
    }

    static boolean deQuy(int[][] arr, int row, int col){
        if (row +1 < arr.length && col +1 < arr[0].length){
            if (arr[row][col] == arr[row+1][col+1]){
                return deQuy(arr, row+1, col+1);
            } else {
                return false;
            }
        }
        return true;
    }
}
