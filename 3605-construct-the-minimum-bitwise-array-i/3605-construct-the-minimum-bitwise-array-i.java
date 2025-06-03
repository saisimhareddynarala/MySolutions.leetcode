class Solution {
    public int[] minBitwiseArray(List<Integer> x) {
        int[] ar = new int[x.size()];
        int c = 0;
        for(int i=0;i<x.size();i++){
            int z  = 0;
            c=0;
            while(z <= x.get(i)){
                if(((z)|(z+1)) == x.get(i)){
                    c++;
                    ar[i] = z;
                    break;
                }
                z++;
            }
            if(c==0)
            ar[i] = -1;
        }
        return ar;
    }
}