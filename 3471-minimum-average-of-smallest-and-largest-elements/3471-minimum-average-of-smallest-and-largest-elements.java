class Solution {
    public double minimumAverage(int[] nums) {
        double[] db = new double[nums.length/2];
        Arrays.sort(nums);
        int z = nums.length;
        int m = nums.length/2;
        int x =0;
        int i=0;
        while(m--  > 0){
            int max  = nums[z-1];
            int min = nums[i];
           double av = (double)(max+min)/2;
           db[x++] = av;
           z--;

            i++;

        }
        double minn = 55.0;
                for(int a=0;a<db.length;a++){
            if(minn > db[a])
            minn = db[a];
        }
        return minn;

    }
}