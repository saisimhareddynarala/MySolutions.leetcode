class KthLargest {
    static ArrayList<Integer> q;
    int k;
    public KthLargest(int k, int[] nums) {
        q = new ArrayList<>();
        for(int i: nums)
        q.add(i);
        this.k = k;
    }
    
    public int add(int val) {
       // ArrayList<Integer> x = new ArrayList<>();
        int v = k;
        q.add(val);
        Collections.sort(q);
        return q.get(q.size()-v);
       
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */