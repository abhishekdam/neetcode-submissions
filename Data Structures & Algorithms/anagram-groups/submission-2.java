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

            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }

            List<String> bucket = groups.get(key);
            bucket.add(word);

        }
        return new ArrayList<>(groups.values());
    }
}
