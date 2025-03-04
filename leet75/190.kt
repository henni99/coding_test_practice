class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n:Int):Int {

        var n = n
        var res = 0
        for(i in 0 until 32) {
            val bit = n and 1

            res = (res shl 1) or bit
            n = n shr 1
            // println(bit)
        }



        return res
    }
}