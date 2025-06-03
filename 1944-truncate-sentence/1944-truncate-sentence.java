class Solution {
    public String truncateSentence(String s, int k) {
        String[] sr = s.split("\\s");
        String ss = "";
        for(int i=0;i<k;i++){
            ss = ss + " " + sr[i];
        }
        return ss.trim();
    }
}