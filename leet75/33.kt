class Solution {
    fun search(nums: IntArray, target: Int): Int {
        
        var start = 0
        var end = nums.size - 1

        if(nums.size == 2) {
            if(nums[0] == target) return 0
            if(nums[1] == target) return 1
        }

        while(start <= end) {

            val mid = (start + end) / 2

            if(nums[mid] == target) return mid

            if(nums[start] <= nums[mid]) {
                
                if(target in nums[start] .. nums[mid]) {
                    end = mid - 1
                } else {
                    start = mid + 1
                }

            } else {
                if(target in nums[mid] .. nums[end]) {
                    start = mid + 1
                } else {
                    end = mid - 1
                }
            }
        }

        return - 1
    }
}