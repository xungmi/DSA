package bfs.vohuong;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<Integer>> adj;
    static int n, m;
    static boolean[] visited;

    public static void inp() throws FileNotFoundException {
        System.setIn(new FileInputStream("E:\\DSA\\src\\bfs\\vohuong\\input.txt"));
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
        visited = new boolean[n+1];
    }

    static void bfs(int u){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(u);
        visited[u] = true;

        while(!queue.isEmpty()){
            int v = queue.poll();
            System.out.print(v +", ");

            for (int x : adj.get(v)){
                if (!visited[x]){
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        inp();
        bfs(1);
    }
}
