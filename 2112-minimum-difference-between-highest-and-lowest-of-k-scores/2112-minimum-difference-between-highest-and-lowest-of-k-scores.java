class Solution {
    public int minimumDifference(int[] nums, int k) {
        int minlen = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - k + 1; ++i) {
            // Calculate the difference between the last and the first element of the current subarray
            int currlen = nums[i + k - 1] - nums[i];
          
            minlen = Math.min(minlen, currlen);
        }
        return minlen;
    }
}