//package bfs.vohuong;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Queue;
//
//public class SameTree {
//    public static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode() {
//        }
//        TreeNode(int val) {
//            this.val = val;
//        }
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    public static boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q == null) return true;
//        if (q == null || p == null) return false;
//
//        Queue<TreeNode> queue1 = new ArrayDeque<>();
//        Queue<TreeNode> queue2 = new ArrayDeque<>();
//
//        queue1.add(p);
//        queue2.add(q);
//
//        while (!queue1.isEmpty() && !queue2.isEmpty()){
//            TreeNode node1 = queue1.poll();
//            TreeNode node2 = queue2.poll();
//
//            if (node1.val != node2.val) return false;
//            //kiem tra con trai
//            if (node1.left != null && node2.left != null){
//                queue1.add(node1.left);
//                queue2.add(node2.left);
//            } else {
//                return false;
//            }
//
//            if (node1.right != null && node2.right != null){
//                queue1.add(node1.right);
//                queue2.add(node2.right);
//            } else {
//                return false;
//            }
//        }
//        return queue1.isEmpty() && queue2.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        TreeNode treeNode13 = new TreeNode(3, null, null);
//        TreeNode treeNode12 = new TreeNode(2, null, null);
//        TreeNode treeNode11 = new TreeNode(1, treeNode12, treeNode13);
//
//        TreeNode treeNode23 = new TreeNode(3, null, null);
//        TreeNode treeNode22 = new TreeNode(2, null, null);
//        TreeNode treeNode21 = new TreeNode(1, treeNode22, treeNode23);
//
//        System.out.println(isSameTree(treeNode11, treeNode21));
//    }
//}
