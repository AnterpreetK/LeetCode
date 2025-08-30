class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int lhs = 0;
        for(int l = 0, r = 0; r < nums.length; r++){
            while(nums[r] - nums[l] > 1) l++;
            if(nums[r] - nums[l] == 1){
                lhs = Math.max(lhs, r-l+1);
            }
        }
        return lhs;
    }
}