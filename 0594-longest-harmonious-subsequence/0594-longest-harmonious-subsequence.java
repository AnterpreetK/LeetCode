class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int maxlen = 0;
        int n = nums.length;
        for(int left = 0, right = 0; right < n; right++){
           while(nums[right] - nums[left] > 1){
            left++;
           }
           if(nums[right] - nums[left] == 1){
            maxlen = Math.max(maxlen, right-left+1);
           }        
        }
        return maxlen;
    }
}