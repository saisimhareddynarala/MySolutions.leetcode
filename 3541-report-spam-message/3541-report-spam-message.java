class Solution {
    public boolean reportSpam(String[] e, String[] b) {
        HashSet<String> x = new HashSet<>();
        for(String s: b){
            x.add(s);
        }
        int c = 0;
        for(String s: e){
            if(x.contains(s))
            c++;
            if(c==2)
            return true;
        }
        return false;
    }
}