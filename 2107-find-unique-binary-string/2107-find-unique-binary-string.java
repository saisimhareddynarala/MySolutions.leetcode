class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String st = "";
        for(int i=0;i<nums.length ; i++){
            if(nums[i].charAt(i)=='0') st = st + "1";
            else st = st + "0";
        }
        return st;
    }
}