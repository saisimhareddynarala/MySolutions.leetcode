class Solution {
    public int maxLength(int[] b) {
        int res = 1,si = b.length;
        //
        int z=0;
        for (z = 0; z < si; z++) {
            long ipd = 1;
            //
                    int sq = b[z],we = b[z];;
           //
 for (int j = z; j < si; j++) {
                ipd = ipd * b[j];
                                sq = meth1(sq, b[j]);
                                                                                            we = mety2(we, b[j]);

 if (ipd == we * sq) res = Math.max(res, j - z + 1);
                
            }
        }
//
                                return res;
    }
       public static long prod(int[] gr) {
        long an=1;
        for (int n : gr) {
            an = an * n;
        }
        return an;
    }
    
     public static int meth1(int peh, int b) {
        while (b != 0) {
            int t = b;
            b = peh % b;
            peh = t;
        }
         
        return peh;
    }
         public static int mety2(int a, int b) {
        return (a / meth1(a, b)) * b;
    }
    

        
    
}