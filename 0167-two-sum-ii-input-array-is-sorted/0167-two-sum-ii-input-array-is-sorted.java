class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new int[2];
        int l = 0;

        int r = numbers.length-1;
        while(l < r)
                {
                    int t = numbers[l] + numbers[r];
                    if(t == target)
                    {
                        a[0] = l+1;
                        a[1] = r+1;
                        return a;
                    }
                    else if(t > target){
                    r--;
                    }
                    else 
                    l++;
                }
                    
                
        return a;
    }
}