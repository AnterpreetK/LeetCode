class Solution {
    public int minimumRecolors(String blocks, int k) {
        int countw = 0;
        int minops = Integer.MAX_VALUE;

        for(int l = 0, r = 0; r < blocks.length(); r++){
            if(blocks.charAt(r) == 'W') countw++;

            if(r-l+1 == k){
                minops = Math.min(minops, countw);
                if(blocks.charAt(l) == 'W') countw--;
                l++;
            }
        }
        return minops;
    }
}