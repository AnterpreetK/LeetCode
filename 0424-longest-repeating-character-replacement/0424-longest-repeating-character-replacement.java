class Solution {
    public int characterReplacement(String s, int k) {
        // characters_to_be_changed = windowSize - maxFreq = k
        int maxfreq = 0;
        int maxwindow = 0;
        int[] freq = new int[26];
        HashMap<String, Integer> map = new HashMap<>();

        for(int  l = 0, r = 0; r < s.length(); r++){
            //update the frequency of the current character
            freq[s.charAt(r) - 'A']++;
            // update the max frequency
            maxfreq = Math.max(maxfreq, freq[s.charAt(r) - 'A']);
            int windowsize = r-l+1;
            // if windowsize - mxfreq > k, then we shrink the window
            if(windowsize - maxfreq > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            windowsize = r-l+1;
            maxwindow = Math.max(maxwindow, windowsize);
        }
        return maxwindow;
   }
}