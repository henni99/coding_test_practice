class Solution {
    fun hammingWeight(n: Int): Int {

        var res = n

        var cnt = 0

        while(res != 0) {
            if(res % 2 != 0) {
                cnt ++
            }
            
            res = res shr 1
    
            // println(res)
        }

        return cnt
    }
}