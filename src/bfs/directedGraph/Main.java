package bfs.directedGraph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, m;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;

    static void inp() throws FileNotFoundException {
        System.setIn(new FileInputStream("E:\\DSA\\src\\bfs\\directedGraph\\input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        adj = new ArrayList<>(n+1);
        for (int i = 0; i < n+1; i++){
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            adj.get(x).add(y);
        }
        visited = new boolean[m+1];
    }

    static void fun(int u){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(u);
        visited[u] = true;

        while (!q.isEmpty()){
            int v = q.poll();
            System.out.print(v +", ");

            for (int x : adj.get(v)){
                if (!visited[x]){
                    q.add(x);
                    visited[x] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        inp();
        fun(1);
    }
}
