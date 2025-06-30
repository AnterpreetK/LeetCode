class Solution {
    public int minimumDifference(int[] nums, int k) {
        int minlen = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(int l = 0, r = 0; r <nums.length; r++){
            while(l<=r && r-l+1>k){
                l++;
            }
            if(r-l+1 == k) minlen = Math.min(minlen, nums[r] - nums[l]);
        }
        return minlen;
    }
}