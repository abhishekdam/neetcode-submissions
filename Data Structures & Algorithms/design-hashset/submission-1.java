class MyHashSet {

    private final int SIZE = 769;
    private List<Integer>[] buckets;

    public MyHashSet() {
        buckets = new ArrayList[SIZE];
        for(int i=0; i< SIZE; i++){
            buckets[i] = new ArrayList<>();
        }
    }

    private int getBucketIndex(int key){
        return key % SIZE;
    }
    
    public void add(int key) {
        int index = getBucketIndex(key);
        List<Integer> bucket = buckets[index];

        if(!bucket.contains(key)){
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        int index = getBucketIndex(key);
        List<Integer> bucket = buckets[index];

        bucket.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int index = getBucketIndex(key);
        List<Integer> bucket = buckets[index];

        return bucket.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */