class Solution {
    public int findMiddleIndex(int[] nums) {
        int c = 0,x=0;
        
        for(int i=0;i<nums.length;i++){
            int rs=0;
        int ls=0;
            for(int j=i+1;j<nums.length;j++){
                rs = rs + nums[j];
            }
            for(int k=i-1;k>=0;k--){
                ls = ls + nums[k];
            }
            if(ls == rs){
x=i;
c++;
break;
            }
        }
        if(c==0)
        return -1;
        return x;

    }
}