class Solution {
    fun getSum(a: Int, b: Int): Int {
    
        var p = a
        var q = b

        while(q != 0) {
            val carry = p and q
            p = p xor q
            q = carry shl 1
        }
    
        return p
    }
}