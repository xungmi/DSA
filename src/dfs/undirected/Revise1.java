package dfs.undirected;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Revise1 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> adj;
    static int n, m;

    static void inp() throws FileNotFoundException {
        System.setIn(new FileInputStream("E:\\DSA\\src\\dfs\\undirected\\input.txt"));
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

    static void dfs(int u){
        Stack<Integer> stack = new Stack<>();
        stack.push(u);
        visited[u] = true;

        while (!stack.isEmpty()){
            int v = stack.pop();
            System.out.print(v + ", ");

            for (int x : adj.get(v)){
                if (!visited[x]){
                    visited[x] = true;
                    stack.push(x);
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        inp();
        dfs(1);
    }
}
