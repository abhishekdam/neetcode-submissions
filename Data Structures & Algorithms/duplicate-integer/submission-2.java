class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int num = 0;
        for(int i : nums){
            if(!seen.add(i)){
                return true;
            }
        }
        
        return false;
    }
}