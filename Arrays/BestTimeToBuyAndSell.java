package Arrays;
public class BestTimeToBuyAndSell {
    // Glouton ?
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices =  {1,2,3,4,5};
        int maxProfit = maxProfit(prices);
        System.out.println("Max profit: " + maxProfit);
    }
}


