class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = 0 ;

        while(left < right){

            int width = right-left;
            int area = Math.min(heights[right],heights[left])*width;
            max = Math.max(max,area);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }

        }
        return max ;
    }
}
