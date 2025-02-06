package math;

public class _70ClimbingStair {
    public int climbStairs(int n) {
        if (n==0 || n ==1){
            return 1;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    //public int climbStairs(int n) {
    //        if (n==0 || n ==1){
    //            return 1;
    //        } else {
    //            return climbStairs(n-1) + climbStairs(n-2);
    //        }
    //    }
}
