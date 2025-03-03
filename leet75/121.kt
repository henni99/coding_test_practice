class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var buy = prices[0]
        var profit = 0
        
        for(i in 1 until prices.size) {
            if(prices[i] < buy) {
                buy = prices[i]
            } else if(prices[i] - buy > profit) {
                profit = prices[i] - buy
            }
        }

        return profit
    }
}