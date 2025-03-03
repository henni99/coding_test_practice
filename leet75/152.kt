class Solution {
    fun maxProduct(nums: IntArray): Int {
        
        val n = nums.size
        val dp = MutableList<MutableList<Int>>(2) { 
            MutableList<Int>(n) { 0 }
         }
        dp[0][0] = nums[0]
        dp[1][0] = nums[0]

        var result = dp[0][0]
        for(i in 1 until n) {
            dp[0][i] = maxOf(dp[0][i-1] * nums[i], nums[i], dp[1][i-1] * nums[i])
            dp[1][i] = minOf(dp[1][i-1] * nums[i], nums[i], dp[0][i-1] * nums[i])

            result = maxOf(result, dp[0][i], dp[1][i])
        }

        // dp.forEach {
        //     println(it)
        // }

        return result

    }
}