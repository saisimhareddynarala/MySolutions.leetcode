class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> x = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sort = new String(ch);
            if(!x.containsKey(sort)){
                x.put(sort , new ArrayList<>());
            }
            x.get(sort).add(s);
        }
        return new ArrayList<>(x.values());
    }
}