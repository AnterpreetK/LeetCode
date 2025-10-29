class Solution {
    public void moveZeroes(int[] nums) {
        for(int l = 0, r = 0; r < nums.length; r++){
        if(nums[r] != 0){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
        }
       }
    }
}