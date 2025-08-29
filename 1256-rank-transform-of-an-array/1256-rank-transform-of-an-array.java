class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ar = new int[arr.length];
        int j = 0;
        for(int i: arr)
         ar[j++] = i;
         Arrays.sort(arr);
         int r = 1;
        HashMap<Integer , Integer> x = new HashMap<>();
        for(int i=0 ; i< arr.length ; i++){
                if(!x.containsKey(arr[i])){
                        x.put(arr[i],r);
                        r++;
                }
        }
        for(int i=0;i<ar.length ; i++){
            ar[i] = x.get(ar[i]);
        }
        return ar;
       


        
        
    }
}