class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        List<Integer> curr = new ArrayList<>();

        backtrack(nums, ans, visited, curr);

        return ans;
    }

    void backtrack(int[] nums, List<List<Integer>> ans, boolean[] visited, List<Integer> curr){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i] == true) continue;

            curr.add(nums[i]);
            visited[i] = true;
            backtrack(nums, ans, visited, curr);

            curr.remove(curr.size()-1);
            visited[i] = false;
        }
    }
}