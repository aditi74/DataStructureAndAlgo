package LeetCode;

/**
 * Created by vikram on 14/11/16.
 * Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 Example 1:
 Input: [7, 1, 5, 3, 6, 4]
 Output: 5

 max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 Example 2:
 Input: [7, 6, 4, 3, 1]
 Output: 0

 In this case, no transaction is done, i.e. max profit = 0.
 */
public class BuySellStock {

    public static void main(String[] args) {
        BuySellStock buySellStock= new BuySellStock();
        int[] arr= {2,1,4};
        System.out.println(buySellStock.maxProfit(arr));
    }

    public int maxProfit(int[] prices) {
           int min=0;
        int maxProfit=0;

        for (int i=0;i<prices.length;i++)
        {
            if (prices[i]< prices[min])
            {
                min=i;
            }


            int currdiff= prices[i]-prices[min];
            if (maxProfit<currdiff)
            {
                maxProfit=currdiff;
            }

        }
        return maxProfit;

    }



}
