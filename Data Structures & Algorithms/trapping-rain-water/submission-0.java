class Solution {
    public int trap(int[] heights) {
        int h = heights.length;
        if (h <= 2)
            return 0;
        int[] lmax = new int[h];
        int[] rmax = new int[h];

        for (int i = 0; i < h; i++) {
            if (i == 0) {
                lmax[0] = heights[0];
            }else{
                lmax[i] = Math.max(heights[i],lmax[i-1]);
            }
            
        }
 System.out.println(Arrays.toString(lmax));
        for (int i = h-1; i >=0 ; i--) {
            if (i == h-1) {
                rmax[i] = heights[i];
            }else{
                rmax[i] = Math.max(rmax[i+1],heights[i]);
            }
            
        }

       
         System.out.println(Arrays.toString(rmax));

        int maxArea = 0;
        for(int i=0; i<h ;i++){
            maxArea += Math.min(lmax[i],rmax[i])-heights[i];
        }
        return maxArea;
    }
}