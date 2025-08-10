class Solution {
    public int maximumStrongPairXor(int[] nums) {
         Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int r = 0;

        for (int l = 0; l < n; l++) {
            if (r < l) r = l;
            // Expand r while condition holds: nums[r] <= 2 * nums[l]
            while (r < n && nums[r] <= 2 * nums[l]) {
                r++;
            }
            // Check all pairs in the window [l, r-1]
            for (int i = l; i < r; i++) {
                for (int j = i; j < r; j++) { // j starts from i (same element allowed)
                    ans = Math.max(ans, nums[i] ^ nums[j]);
                }
            }
        }
        return ans;
    }
}