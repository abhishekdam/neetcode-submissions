class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] s_ch = s.toCharArray();
        char[] t_ch = t.toCharArray();

        int[] seenIt = new int[26];

        for(int i=0; i<s.length(); i++){
            seenIt[s_ch[i] - 'a'] += 1;
            seenIt[t_ch[i] - 'a'] -= 1;
        }

        for(int seen : seenIt){
            if(seen != 0) return false;
        }

        return true;
    }
}
