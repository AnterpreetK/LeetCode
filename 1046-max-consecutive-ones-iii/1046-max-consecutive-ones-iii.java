class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxones = 0, zeroes = 0;
        int l = 0, r = 0;

        while(r < nums.length){
            if(nums[r] == 0) zeroes++;

        while(zeroes > k){
            if(nums[l] == 0) zeroes--;
            l++;
        }
        maxones = Math.max(maxones, r-l+1);
        r++;
        }
        return maxones;
    }
}