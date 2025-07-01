class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int cnt = 0;

        for(int l = 0, r = 0; r < str.length(); r++){
            // when window size is k
            if(r-l+1 == k){
                //extract string
                String sub = str.substring(l, r+1); // inclusive of r
                int val = Integer.parseInt(sub);

                // check if val != 0 and divides num
                if(val != 0 && num % val == 0) {
                    cnt++;
                }
                // move left ointer only when window is full
                l++;
            }
        }
        return cnt;
    }
}