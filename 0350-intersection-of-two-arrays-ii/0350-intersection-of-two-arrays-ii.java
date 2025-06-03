class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> x = new ArrayList<Integer>();
        int i=0,j=0;
        while(i<nums1.length &&  j < nums2.length){
            if(nums1[i] == nums2[j])
            {
                x.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
             j++;
            }
            else
            i++;

        }
        int[] ar = new int[x.size()];
        for(int a=0;a<x.size();a++){
            ar[a] = x.get(a);
        }
        return ar;
    }
}