class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;  // Pointer for s

        // Loop through t using a for loop
        for (int j = 0; j < t.length(); j++) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;  // Move to next character in s when matched
            }
        }

        // If we matched all characters in s, it's a subsequence
        return i == s.length();
    }
}
