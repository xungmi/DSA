package backtracking;

public class ToMauDoThi {
/*
Tô màu n đỉnh của đồ thị sao cho hai đỉnh
kề nhau có màu khác nhau, sử dụng tối đa m màu duoc hay khong?
Ý tưởng: Với mỗi đỉnh, thử từng màu từ 1 đến m,
kiểm tra xem màu có hợp lệ (không trùng với đỉnh kề).
Nếu hợp lệ, tô màu và đệ quy.
*/
    static void graph_coloring(int[][] graph, int vertexNum, boolean[] color, int vertex){
        if (vertex == vertexNum){
            System.out.println();
        }

		
    }

    public static void main(String[] args) {
        int vertexNum = 4; // so dinh
        int colorNum = 3;  // so mau
        int[][] graph = {  // ma trận kề
                {0, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {1, 0, 1, 0}
        };
        boolean[] color = new boolean[colorNum];
        graph_coloring(graph, vertexNum, color, 0);
    }
}
