class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        while(i >= 0 && digits[i]==9){
            digits[i] = 0;
            i--;
        }
        if(i < 0){
            int[] ar = new int[digits.length+1];
            System.arraycopy(digits , 0, ar , 1 ,digits.length);
            ar[0] = 1;
            return ar;
        }
        else{
            digits[i]++;
         return digits;
        }
    }
}