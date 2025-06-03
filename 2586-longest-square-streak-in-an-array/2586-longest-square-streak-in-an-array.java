class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> x = new HashSet<>();
        for(long n: nums){
            x.add((long)n);
        }
        int s = 1;
        for(long n : nums){
            int t = 1;
            while(x.contains(n*n)){
                t++;
                n=n*n;
            }
            s = Math.max(s,t);
        }
            return  s==1? -1 : s;
        }
        
    }
