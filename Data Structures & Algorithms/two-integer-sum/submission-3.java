class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> checker = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(checker.containsKey(complement))
                return new int[]{checker.get(complement), i};
            else 
                checker.put(nums[i], i);
        }
        return new int[]{};
    }
}
