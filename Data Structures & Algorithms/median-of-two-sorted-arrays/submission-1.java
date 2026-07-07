class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int [] ans = new int[m+n];
        int i = 0 , j =0 , k = 0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ans[k++] = nums1[i++];
            }else{
                ans[k++] = nums2[j++];
            }
        }
        while(i<m){
            ans[k++] = nums1[i++];
        }
        while(j<n){
            ans[k++] = nums2[j++];
        }

        boolean even = ( m+n) %2 ==0 ? true : false ;
        int mid = (m+n) /2;
        return even ?  (ans[mid]+ans[mid-1])/2.0  : (double)ans[mid];
    }
}
