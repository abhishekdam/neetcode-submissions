class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
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

            if(!group.containsKey(key)){
                group.put(key, new ArrayList<>());
            }
            List<String> bucket = group.get(key);
            bucket.add(word);
        }

        return new ArrayList<>(group.values());
    }
}
