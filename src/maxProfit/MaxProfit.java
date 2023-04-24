package maxProfit;

public class MaxProfit {
	public static int maxProfit(int[] prices) {
		int minPrice = prices[0]; // price in the first day
		int maxProfit = 0, profit, priceToday;

		for (int buyDay = 1; buyDay < prices.length; buyDay++) { // start from day 2
			priceToday = prices[buyDay]; // price for each day
			if (priceToday == Math.min(priceToday, minPrice)) {
				minPrice = priceToday; // skip to the next day if min price is today
				continue;
			}
			profit = priceToday - minPrice; // today's price - min price
			maxProfit = Math.max(profit, maxProfit); // find max profit
		}
		return maxProfit;
	}
}
