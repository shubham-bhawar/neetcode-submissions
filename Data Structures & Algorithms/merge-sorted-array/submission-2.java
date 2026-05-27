class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 , j =0;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int x : nums2) temp.add(x);
        if(n==0) return ;
        while(i<m){
            if(temp.get(j) < nums1[i]){
                int temp1 = nums1[i];
                nums1[i] = temp.get(j); 
                temp.remove(0);
                temp.add(temp1);
                Collections.sort(temp);
            }else{
                i++;
            }
        }
        int l = nums1.length-1;
        for(int k = n-1 ; k>=0 ;k--){
            nums1[l] = temp.get(k);
            l--;
        }
        return ;
    }
}