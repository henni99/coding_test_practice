class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        
        val n = nums.size
        val result = IntArray(n)
    
        var temp = 1
        for(i in 1 until n) {
            result[i] = result[i-1] * nums[i-1]
        }

         temp = 1
        for(i in n - 1 downTo 0) {
            result[i] *= temp
            temp *= nums[i]
        }

        // println(result.toList())

        
        return result
    }
}