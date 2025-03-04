class Solution {
    fun countBits(n: Int): IntArray {

        val dp = IntArray(n+1)

        for(i in 1 .. n) {
            dp[i] = dp[i shr 1] + (i and 1)
        }

        return dp
    }
}