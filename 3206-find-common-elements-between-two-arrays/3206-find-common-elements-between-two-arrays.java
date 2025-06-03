class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c = 0,b=0;
        int[] ar = new int[2];
        for(int i=0;i < nums1.length;i++){
            for(int j=0;j < nums2.length;j++){
                if(nums1[i] == nums2[j]){
                c++;
                break;
                }
            }
        }
        for(int x=0;x<nums2.length;x++){
            for(int y=0;y<nums1.length;y++){
                if(nums2[x] == nums1[y]){
                    b++;
                    break;
                }
            }
        }
        ar[0] = c;
        ar[1] = b;
        return ar;
    }
}