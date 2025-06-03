class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> x = new ArrayList<>();
        HashMap<Integer,Integer> m = new HashMap<>();
       
        for(int i=0;i<nums.length;i++){
            
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            if(m.get(nums[i]) <= 2)
            x.add(nums[i]);
        }
        for(int i=0;i<x.size();i++){
            
            nums[i] = x.get(i);
          
        }
        
        return x.size();
    }
}