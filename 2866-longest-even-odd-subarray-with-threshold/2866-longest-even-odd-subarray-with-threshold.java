class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxlen = 0;
        int n = nums.length;
        int l = 0;

        for (int r = 0; r < n; r++) {
            if (nums[r] > threshold) {
                l = r + 1; // reset window
                continue;
            }

            if (r > l && nums[r] % 2 == nums[r - 1] % 2) {
                l = r; // parity failed, move l to r
            }

            if (nums[l] % 2 != 0) {
                l = r + 1; // window must start with even
                continue;
            }

            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }
}
