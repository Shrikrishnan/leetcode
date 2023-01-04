public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        return reverse(n) ;
    }
    public int reverse(int A) {
        int aa = A ;
        int r = 0;
        int rs = 0;
        for (int i =0; i<32 ;i++){
            r = aa&1 ;
            aa = aa>>1 ;
            rs = rs << 1 ;
            rs = rs ^ r ;
        }

        return rs ;
    
    }
}