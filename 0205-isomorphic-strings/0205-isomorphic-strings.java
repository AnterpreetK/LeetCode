class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> st = new HashMap<>();
        HashMap<Character, Character> tt = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(st.containsKey(cs)) {
                if(st.get(cs) != ct) return false;
            } else {
                st.put(cs, ct);
            }

            if(tt.containsKey(ct)) {
                if(tt.get(ct) != cs) return false;
            } else {
                tt.put(ct,cs);
            }
        } 
        return true;
    }
}