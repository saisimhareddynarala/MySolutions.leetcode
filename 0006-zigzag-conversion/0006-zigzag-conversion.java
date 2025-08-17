class Solution {
    static class Pair{
        char c;
        int r;
        Pair(Character c , int r){
            this.c=c;
            this.r=r;
        }
    }
    ArrayList<Pair> x = new ArrayList<>();
    public String convert(String s, int nu) {
      //  int row = nu-1;
        int k = 1;
        int u = 1;
        if(nu==1) return s;
        for(int i=0;i<s.length();i++){
             if(k > nu){
                k = nu-1;
                u=0;
             }
             if(k == 0){
                k = 2;
                u = 1;
             }

             if(u==1){
                x.add(new Pair(s.charAt(i) , k));
                k++;
             }
             if(u==0){
                x.add(new Pair(s.charAt(i) , k));
                k--;
             }
        }
        String st= "";
        for(int i=1;i<=nu;i++){
        for(Pair p: x){
          if(p.r==i) st=st+p.c;
        }
        }
        return st;
    }
}