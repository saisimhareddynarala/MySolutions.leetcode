class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int x = 0;
        ArrayList<Integer> d = new ArrayList<>();
        
        while(i< nums1.length && j< nums2.length){
            if(nums1[i] == nums2[j] && !(d.contains(nums1[i]))){

            d.add(nums1[i]);
            i++;
            j++;
            }
            else if(nums1[i] > nums2[j])
            {
                j++;
            }
            else
            i++;
        }
        int aa[] = new int[d.size()];
        for(int z=0;z<d.size();z++ ){
            aa[z]= d.get(z);
        }
        return aa;
        
    }
}