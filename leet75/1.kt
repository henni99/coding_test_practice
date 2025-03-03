
data class Node(
    val idx: Int,
    val num: Int
)

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

       val diffMap = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, int ->
            diffMap[int]?.let { return intArrayOf(it, index)}
            diffMap[target - int] = index
      
            println(diffMap)
        }
       
       return intArrayOf(target, target)
    }
}

/**
 *  diffMap[7] = 0
    diffMap[2] = 1
    diffMap[-2] = 2
    diffMap[-6] = 3
 */