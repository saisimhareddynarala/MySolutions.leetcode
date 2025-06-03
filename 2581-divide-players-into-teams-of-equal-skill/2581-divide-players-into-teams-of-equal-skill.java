class Solution {
    public long dividePlayers(int[] s) {
        Arrays.sort(s);
        long pr = 0;
        int c = 0;
        int[] ar = new int[s.length/2];
        for(int i=0,j=s.length-1;i<s.length/2;i++,j--){
            ar[i] = s[i] + s[j];
            pr = pr + (s[i] * s[j]);
        }
        for(int i=0;i<ar.length-1;i++){
            if(ar[i] != ar[i+1]){
                c++;
                break;
            }
        }
        if(c==0)
        return pr;
        return -1;
        

    }
}