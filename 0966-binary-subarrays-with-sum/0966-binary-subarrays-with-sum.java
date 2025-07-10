import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0, currSum = 0;
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // base case: empty prefix has sum 0

        for (int num : nums) {
            currSum += num;

            // Check if there is a prefix sum that leaves `goal`
            count += prefixSumCount.getOrDefault(currSum - goal, 0);

            // Update the count of current prefix sum
            prefixSumCount.put(currSum, prefixSumCount.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}
