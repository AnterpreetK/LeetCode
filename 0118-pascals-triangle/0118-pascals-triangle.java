class Solution {

    private static int nCr(int n, int r){
        long res = 1;
        for(int i = 0; i < r; i++){
            res = res*(n-i) / (i+1);
        }
        return (int) res;
    }

    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row <= n; row++){
            List<Integer> templist = new ArrayList<>();
            for(int col = 1; col <= row; col++){
                templist.add(nCr(row-1, col-1));
            }
            ans.add(templist);
        }
        return ans;
    }
}