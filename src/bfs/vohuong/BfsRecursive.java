package bfs.vohuong;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class BfsRecursive {
    static int n, m;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;

    static void inp() throws FileNotFoundException {
        System.setIn(new FileInputStream("E:\\DSA\\src\\bfs\\input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        adj = new ArrayList<>(n);
        for (int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        System.out.println(adj);
        visited = new boolean[1001];// init full false
    }

    static void bfs(int u){
        //buoc khoi tao
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(u);
        visited[u] = true;

        //duyet
        while (!queue.isEmpty()){
            int v = queue.poll();//lay dinh ra khoi hang doi va remove
            System.out.print(v +", ");
            //kiem tra cac dinh ke cua v
            for (int x : adj.get(v)){
                if (!visited[x]){
                    queue.add(x);
                    visited[x] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        inp();
        bfs(1);
    }
}
