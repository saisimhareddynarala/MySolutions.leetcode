class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int c = 0;
        ArrayList<Integer> x = new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1] > threshold)
            x.add(i);
        }
        return x;
    }
}