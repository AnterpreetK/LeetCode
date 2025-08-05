class Solution {
    public String largestOddNumber(String num) {

        // if we start from the back, then we can check the odd number and it will automatically be the longest odd number in String
        for(int i = num.length() - 1; i >= 0; i--){
            if(num.charAt(i) % 2 != 0) return num.substring(0,i+1);
        }
    return "";
    }
}