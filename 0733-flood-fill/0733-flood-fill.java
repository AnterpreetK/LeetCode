class Solution {
    private int[][] image; // box of colors
    private int oc; // the old color we are replacing
    private int color; // new color
    private final int[] dirs = {-1,0,1,0,-1}; // direction helper

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Using DFS (Depeth First Search Algorithm)
        oc = image[sr][sc];
        if(oc == color) return image;
        this.image = image;
        this.color = color;
        dfs(sr, sc);
        return image;
    }

    private void dfs(int i, int j){
        image[i][j] = color;

        for(int k = 0; k < 4; k++){
            int x = i + dirs[k];
            int y = j + dirs[k+1];
            if(x >= 0 && x < image.length &&
               y >= 0 && y < image[0].length &&
               image[x][y] == oc) {
                dfs(x,y);
               }
        }
    }
}