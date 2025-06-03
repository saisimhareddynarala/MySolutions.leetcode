class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        
       
       int c  = 1;
        int[] ar = new int[2];
        for(int i=0;i<s.length();i++){
            int x = s.charAt(i) - '0' - 49;
          
            sum = sum + widths[x];
            if(sum == 100){
                if(i==s.length()-1){

                }
                else{
                sum = 0;
                c++;
                }
            }
            else if(sum > 100){
                c++;
                sum = widths[x];
            }
            
        }
        ar[0] = c;
        ar[1] = sum; 
        return ar;
    }
}