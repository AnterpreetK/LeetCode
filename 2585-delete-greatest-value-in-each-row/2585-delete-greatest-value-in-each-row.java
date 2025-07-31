class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
            Arrays.sort(grid[i]);
        }

        int totalScore = 0;

        for(int col = n-1; col >= 0; col--){
            int currMax = 0;
            for(int row = 0; row < m; row++){
                currMax = Math.max(currMax, grid[row][col]);
            }
            totalScore += currMax;
        }
        return totalScore;
    }
}