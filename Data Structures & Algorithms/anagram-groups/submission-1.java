class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> groups= new HashMap<>();
        for(String word : strs){
            int[] count = new int[26];
            for(char c : word.toCharArray()){
                count[c - 'a']++;
            }
        

            StringBuilder sb = new StringBuilder();
            for(int freq : count){
                sb.append('#').append(freq);
            }
            String key = sb.toString();

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(groups.values());
    }
}
