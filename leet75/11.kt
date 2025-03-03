class Solution {
    fun maxArea(height: IntArray): Int {
        
        val size = height.size

        var max= 0

        var left = 0

        var right = size -1 

        while(left < right) {
            val width = (right - left)
            val heights = minOf(height[left], height[right])

            max = maxOf(max, width * heights)

            if(height[left] < height[right]) {
                left ++
            } else {
                right --
            }
        }


        return max
    }
}