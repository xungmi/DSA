package bfs.vohuong;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

//tim khoang cach ngan nhat thi dinh s den dinh t trong do thi ko co trong so
public class ShortestPath {
    static int n, m;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;

    static void inp() throws FileNotFoundException {
        System.setIn(new FileInputStream("E:\\DSA\\src\\bfs\\vohuong\\input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        adj = new ArrayList<>(n);
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        visited = new boolean[1001];// init full false
    }

    static int fun(int s, int t) {
        //buoc khoi tao
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        int[] dist = new int[n+1];
        Arrays.fill(dist, -1);
        dist[s] = 0;

        while (!queue.isEmpty()) {
            int v = queue.poll();//lay dinh ra khoi hang doi va remove
//            System.out.print(v + ", ");
            //kiem tra cac dinh ke cua v
            for (int x : adj.get(v)) {
                if (!visited[x]) {
                    queue.add(x);
                    visited[x] = true;
                    dist[x] = dist[v] + 1;
                    if (x == t) return dist[t];
                }
            }
        }
        return -1;//khong tim thay duong di
    }

    public static void main(String[] args) throws FileNotFoundException {
        inp();
        System.out.println(fun(1, 6));
    }

}
