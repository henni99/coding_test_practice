class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()

        val list = mutableListOf<List<Int>>()

        if(nums[0] > 0) {
            return listOf()
        }

        if(nums[nums.size - 1] < 0) {
            return listOf()
        }

        for(i in 0 until nums.size - 1) {
            val cur = nums[i]

            var start = i + 1
            var end = nums.size - 1

            while(start < end) {

                var sum = nums[start] + nums[end]

                if(cur + sum == 0) {
                    list.add(listOf(nums[i], nums[start], nums[end]))
                    start ++

                    while(start < nums.size && nums[start] == nums[start-1]) start ++
                }  else if(cur + sum > 0) {
                    end --
                } else {
                    start ++
                }
            }
        }
    
        return list.toList()
    }
}