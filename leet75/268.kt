class Solution {
    fun missingNumber(nums: IntArray): Int {
        var n = nums.size

        for(i in 0 until nums.size) {
            n = n xor i xor nums[i]
        }

        return n
    }
}