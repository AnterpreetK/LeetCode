class Solution {
    public String longestNiceSubstring(String s) {
        int maxlen = 0;
        String res = "";

        for(int left = 0; left < s.length(); left++){
            Set<Character> set = new HashSet<>();
            for(int right = left; right < s.length(); right++){
                set.add(s.charAt(right));

                if(isNice(set)){
                    int windowlen = right - left + 1;
                    if(windowlen > maxlen){
                        maxlen = windowlen;
                        res = s.substring(left,right+1);
                    }
                }
            }
        }
        return res;
    }

    private boolean isNice(Set<Character> set){
        for(char c : set){
            if(Character.isLowerCase(c) && !set.contains(Character.toUpperCase(c))){
                return false;
            }
            if(Character.isUpperCase(c) && !set.contains(Character.toLowerCase(c))){
                return false;
            }
        }
        return true;
    }
}