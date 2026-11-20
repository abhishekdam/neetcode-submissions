class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> group = new HashMap<>();
        for(int i : nums){
            int key = i;
            if(!group.containsKey(key)){
                group.put(key, 1);
            }else{
                int oldCount = group.get(key);
                group.put(key, oldCount + 1);
            }
            if(group.get(key) > nums.length/2){
                return key;
            }
        }
        return 0;
    }
}