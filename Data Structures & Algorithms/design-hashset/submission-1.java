class MyHashSet {
    int [] ans;
    public MyHashSet() {
        ans = new int[1000000];
        Arrays.fill(ans,-1);
    }
    
    public void add(int key) {
        ans[key] = key;
    }
    
    public void remove(int key) {
        ans[key]=-1;
    }
    
    public boolean contains(int key) {
        return ans[key]==key;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */