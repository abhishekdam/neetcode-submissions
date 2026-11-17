class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        int i = 0;
        while(i < str[0].length() && i < str[str.length-1].length()){
            if(str[0].charAt(i) == str[str.length-1].charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return str[0].substring(0,i);
    }
}