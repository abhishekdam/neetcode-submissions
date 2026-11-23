class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> countMap = new HashMap<>();

        for(int i : nums){
            if(!countMap.containsKey(i)){
                countMap.put(i, 1);
            }else{
                countMap.put(i, countMap.get(i) + 1);
            }
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int i=0; i <buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(int i : countMap.keySet()){
            int freq = countMap.get(i);
            buckets[freq].add(i);
        }

        int[] result = new int[k];
        int resultIndex = 0;

        for(int i=buckets.length-1; i>=1; i--){
            List <Integer> currentBucket = buckets[i];

            for(int j=0; j<currentBucket.size(); j++){
                result[resultIndex] = currentBucket.get(j);
                resultIndex++;

                if(resultIndex == k) return result;
            }
        }

        return result;
    }
}
