class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] s_ch = s.toCharArray();
        char[] t_ch = t.toCharArray();
        Arrays.sort(s_ch);
        Arrays.sort(t_ch);
        if(Arrays.equals(s_ch, t_ch)) return true; 
        return false;
    }
}
