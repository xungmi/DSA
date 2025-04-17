//package bfs.vohuong;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class KiemTraLienThong {
//    static int n, m;
//    static ArrayList<ArrayList<Integer>> adj;
//    static boolean[] visited;
//
//    static void inp() throws FileNotFoundException {
//        System.setIn(new FileInputStream("E:\\DSA\\src\\bfs\\vohuong\\input.txt"));
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//
//        adj = new ArrayList<>(n+1);
//        for (int i = 0; i<=n; i++){
//            adj.add(new ArrayList<>());
//        }
//        for (int i = 0; i < m; i++){
//            int x, y;
//            x = sc.nextInt();
//            y = sc.nextInt();
//            adj.get(x).add(y);
//            adj.get(y).add(x);
//        }
//        visited = new boolean[n+1];
//    }
//    static void bfs(int u){
//        Queue<Integer> q = new LinkedList<>();
//        q.add(u);
//        visited[u] = true;
//
//        while(!q.isEmpty()){
//            int v = q.poll();
//            for (int x : adj.get(v)){
//                if (!visited[x]){
//                    visited[x] = true;
//                    q.add(x);
//                }
//            }
//        }
//    }
//
//    static boolean isConnected(){
//        bfs(1);
//        boolean isConnected = true;
//        for (int i = 1; i <=n; i++){
//            if(!visited[i]){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    static int countConnectedComponent(){
//        int count = 0;
//        bfs(1);
//
//        for (int i = 1; i <= n; i++){
//            if (!visited[i]){
//                bfs(i);
//                count++;
//            }
//        }
//        return count==0?1: count;
//    }
//
//    static boolean hasCycle(){
//        bfs(1);
//        for ()
//    }
//
//    public static void main(String[] args) throws FileNotFoundException {
//        inp();
//        System.out.println(isConnected()?"YES" : "NO");
//        System.out.println(countConnectedComponent());
//    }
//}
