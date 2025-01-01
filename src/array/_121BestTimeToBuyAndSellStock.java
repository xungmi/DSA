package array;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=problem-list-v2&envId=array
public class _121BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int price_min = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices){
            if (price < price_min){
                price_min = price;
            }

            if (price - price_min > profit){
                profit = price - price_min;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
