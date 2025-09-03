class Solution {
    public String reverseWords(String s) {
        String[] ar = s.split("\\s+");
        String res = "";
        for(String i : ar){
            for(int j = i.length()-1 ; j >= 0 ; j--){
                res = res+i.charAt(j);
            }
            res = res + " ";
        }
        return res.trim();
    }
}