package Arrays;

public class StockMarketMaximumProfit {
    public static void main(String[] args) {

        int [] arr ={1,2,3,0,2};
        System.out.println(maximumProfit(arr));

    }

    static int  maximumProfit(int [] arr){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int j : arr) {

            if (buyPrice < j) {
                int profit = j - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else buyPrice = j;

        }
        return maxProfit;
    }
}
