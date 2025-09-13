class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int store = target - nums[i];
            if(mp.containsKey(store)){
                return new int[] {mp.get(store), i};
            }
            mp.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}