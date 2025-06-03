class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ar = new int[nums1.length + nums2.length];
        
        for(int i=0;i<nums1.length;i++){
            ar[i] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            ar[nums1.length + i] = nums2[i];
        }
        if(ar.length == 0)
        return 0;
        if(ar.length == 1)
        return ar[0];

        Arrays.sort(ar);
        int x = ar.length/2 ;
        double avg = (double)(ar[x] + ar[x-1])/2;

        if(ar.length % 2 != 0){
            return (double)ar[x];
        } 
        else 
        return avg;
    }
}