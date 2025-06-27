class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxlen = 0;
        for(int start = 0, end = 0; end < s.length(); end++){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start)); // remove leftmost char
                start++;
            }
            set.add(s.charAt(end)); // add current char to window
            maxlen = Math.max(maxlen, end-start+1);
        }
        return maxlen;
    }
}