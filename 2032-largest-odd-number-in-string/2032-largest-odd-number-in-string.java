class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i = n-1; i >= 0; i--){
            char s = num.charAt(i);
            if((s - '0') % 2 != 0) return num.substring(0,i+1);
        }
        return "";
    }
}