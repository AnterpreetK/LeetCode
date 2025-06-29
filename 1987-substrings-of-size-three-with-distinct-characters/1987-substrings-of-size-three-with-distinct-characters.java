class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int n = s.length();

        for(int i = 0; i <= n-3; i++){
            int a = s.charAt(i);
            int b = s.charAt(i+1);
            int c = s.charAt(i+2);

            if(a != b && a != c && b != c) count++;
        }
        return count;
    }
}