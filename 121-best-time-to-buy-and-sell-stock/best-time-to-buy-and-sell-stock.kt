class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minPrice = prices[0]
        
        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            }
            
            val profit = price - minPrice
            maxProfit = maxOf(maxProfit, profit)
        }
        
        return maxProfit
    }
}