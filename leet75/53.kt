class Solution {
    fun maxSubArray(nums: IntArray): Int {
        
        var result = nums[0]
        var res = nums[0]


        for(i in 1 until nums.size) {
            // 0 = 이전것과의 합
            if(result < 0) result = 0

            result += nums[i]
            res = maxOf(res, result)
        }
    
        // dp.forEach {
        //     println(it)
        // }
        

        return res
    }
}