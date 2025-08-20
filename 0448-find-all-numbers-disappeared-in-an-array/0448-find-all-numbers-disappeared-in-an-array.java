class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i: nums){
            h.add(i);
        }
        for(int i = 1; i<nums.length+1; i++){
            if(!h.contains(i)){
                ar.add(i);
            }
        }
        return ar;
    }
}