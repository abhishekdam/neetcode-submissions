class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] char_word = word.toCharArray();
            Arrays.sort(char_word);
            String key = new String(char_word);
            
            // if (!map.containsKey(key)) {
            //     map.put(key, word);
            // }else{
            //     map.get(key).add(word);
            // }

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
