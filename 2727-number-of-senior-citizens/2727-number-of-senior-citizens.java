class Solution {
    public int countSeniors(String[] details) {
        int c  = 0;
        for(int i=0;i< details.length;i++){
            if((details[i].charAt(11) >= '6') && ((details[i].charAt(11) - '0') + (details[i].charAt(12) - '0')  > 6))
            c++;
        }
        return c;
    }
}