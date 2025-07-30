class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> x = new HashMap<>();
        for(char a: s.toCharArray()) x.put(a, x.getOrDefault(a,0)+1);
        int q=0;
        for(char a: s.toCharArray()){
            
            if(x.get(a)==1) return q;
            q++;
        }
        return -1;
        
    }
}