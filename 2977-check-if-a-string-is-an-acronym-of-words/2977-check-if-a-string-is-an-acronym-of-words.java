class Solution {
    public boolean isAcronym(List<String> words, String s) {
       String s1 = "";
       String[] w = new String[words.size()];
       int x = 0;
       for(String h: words){
        w[x++] = h;
       }
       for(int i=0;i < w.length;i++){
        s1 = s1 + w[i].charAt(0);
       } 
      
       if(s1.equals(s))
       return true;
       return false;
    }
}