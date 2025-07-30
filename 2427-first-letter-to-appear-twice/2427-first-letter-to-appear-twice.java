class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> x = new HashSet<>();
        for(char a: s.toCharArray()){
            if(!x.contains(a))
            x.add(a);
            else return a;
        }
        return 'a';
    }
}