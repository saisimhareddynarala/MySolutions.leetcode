class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i < n; i++){
            nums1[m+i] = nums2[i];
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(nums1[i] > nums1[j]){
                    int te = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = te;
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]);
        }
    }
}