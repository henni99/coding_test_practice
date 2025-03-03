class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        
        val hashMap = hashMapOf<Int, Int>()
        nums.forEach {
            if(hashMap[it] == null) {
                hashMap[it] = 1 
            } else {
                return true
            }
        }

        return false
    }
}