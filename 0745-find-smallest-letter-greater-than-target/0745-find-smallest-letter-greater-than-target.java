class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch = 'c';
        int c  = 0;
        for(int i=0;i<letters.length;i++){
        if(target < letters[i]){
        ch = letters[i];
        c++;
        break;

        }
        }
        if(c>0)
        return ch;
        else
        return letters[0];
        
    }
}