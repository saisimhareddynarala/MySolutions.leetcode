class Solution {
    public String[] findWords(String[] words) {
        String f = "qwertyuiop";
        String s = "asdfghjkl";
        String t = "zxcvbnm";
        List<String> y = new ArrayList<>();
        HashMap<Character , Integer> x = new HashMap<>();
        for(char c: f.toCharArray()){
            x.put(c , x.getOrDefault(x , 1));
        }
        for(char c: s.toCharArray()){
            x.put(c , x.getOrDefault(x , 2));
        }
        for(char c: t.toCharArray()){
            x.put(c , x.getOrDefault(x , 3));
        }
        for(String st : words){
            int var = 0;
            String g = st.toLowerCase();
            int i = x.get(g.charAt(0));
            for(char ch : g.toCharArray()){
                if(i != x.get(ch)){
                    var++;
                    break;
                }
            }
            if(var==0) y.add(st);

        }
        String[] ans = new String[y.size()];
        int q = 0;
        for(String xx : y) ans[q++] = xx;
        return ans;


    }
}