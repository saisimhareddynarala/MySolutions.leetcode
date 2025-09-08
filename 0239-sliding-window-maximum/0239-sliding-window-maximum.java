class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ar = new int[nums.length-k+1];
        int id = 0;
        Deque<Integer> q = new LinkedList<>();
        for(int i = 0 ; i< k ; i++){
            while(!q.isEmpty() && q.getFirst() < nums[i]){
                q.removeFirst();
            }
            q.addFirst(nums[i]);
        }
        ar[id++] = q.getLast();
          for(int i = k ; i< nums.length ; i++){
            while(!q.isEmpty() && q.getFirst() < nums[i]){
                q.removeFirst();
            }
            q.addFirst(nums[i]);
            if( nums[i-k]==q.getLast()){
                q.removeLast();
            }
            ar[id++] = q.getLast();
        }
        return ar;

    }
}