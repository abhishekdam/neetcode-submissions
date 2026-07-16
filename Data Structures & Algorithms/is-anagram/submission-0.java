class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_ch = s.toCharArray();
        char[] t_ch = t.toCharArray();
        Arrays.sort(s_ch);
        Arrays.sort(t_ch);
        if(s_ch.length != t_ch.length) return false;
        for(int i = 0; i< s_ch.length; i++){
            if(s_ch[i] != t_ch[i]) return false; 
        }
        return true;
    }
}
