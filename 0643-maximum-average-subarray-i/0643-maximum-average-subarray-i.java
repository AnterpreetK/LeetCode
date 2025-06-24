class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxSum = sum;

        for(int r=k; r<nums.length; r++){
            sum += nums[r];
            sum -= nums[r-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k; // the problem is asking for average not maxsum - maxsum/k (divided by k beacuse in each test case k would be different)
    }
}