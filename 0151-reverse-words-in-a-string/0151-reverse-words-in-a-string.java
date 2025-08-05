class Solution {
    public String reverseWords(String s) {

        // trim + split + reverse

        // Step 1 : Trim() the string
        s = s.trim();

        // Step 2 : Split by one or more spaces
        String[] words = s.split("\\s+");

        // Step 3: Use StringBuilder to reverse the words
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            if(i != 0) sb.append(" "); // no spaces at the end
        }
        return sb.toString();
    }
}