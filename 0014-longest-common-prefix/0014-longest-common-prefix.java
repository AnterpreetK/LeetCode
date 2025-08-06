class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Edge case: if array is empty, return ""
        if (strs.length == 0) return "";

        // Traverse each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i); // current character to compare

            // Compare with the same character index of all other strings
            for (int j = 1; j < strs.length; j++) {
                // If i reaches end of strs[j] OR chars mismatch -> prefix ends here
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i); // return prefix up to i (exclusive)
                }
            }
        }

        // If no mismatch found, the whole first string is the prefix
        return strs[0];
    }
}
