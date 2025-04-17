package dfs.undirected;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Recursive {
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] visited;
    static int n, m;

    static void dfs(int v){
        visited[v] = true;
//        System.out.print(v +", ");

        for(int x : adj.get(v)){
            if (!visited[x]){
                dfs(x);
            }
        }
    }

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
        visited = new boolean[1001];// init full false
    }

    static int countConnectedComponent(){
        int count = 0;
//        dfs(1);
        for (int i = 1; i <=n; i++){
            if (!visited[i]){
                count++;
                dfs(i);
            }
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        inp();
//        dfs(1);
        System.out.println(countConnectedComponent());
    }
}
