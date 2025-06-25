class Solution {
    public int mySqrt(int x) {
        if(x == 1) return x;

        int l = 1, r = x/2;
        while(l <= r){
            int m = (l+r) / 2;
            long sq = (long)m * m;
            if(sq == x) return m;
            else if(sq < x) l = m+1;
            else r = m-1;
        }
        return r;
    }
}