class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0,j=0,c=0;
        while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]){
                c++;
                i++;
                j++;
            }
            else
            j++;




        }
        return c;
    }
}