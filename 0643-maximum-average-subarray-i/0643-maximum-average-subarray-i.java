class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double maxavg = Double.NEGATIVE_INFINITY;
        for(int l = 0, r = 0; r < nums.length; r++){
            sum += nums[r];
            if(r-l+1 == k){
                maxavg = Math.max(maxavg,(double)sum/k);
                sum -= nums[l];
                l++;
            }
        }
        return maxavg;
    }
}

