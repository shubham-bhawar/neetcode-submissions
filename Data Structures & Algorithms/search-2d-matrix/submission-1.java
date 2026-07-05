class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int col = matrix[0].length;
        int rowTobeChecked = -1;
        
        for(int i =0 ; i< matrix.length ; i++){
            
            System.out.println(i + " *** "+matrix[i][col-1]);
            if(matrix[i][col-1] >= target){
                
                rowTobeChecked = i;
                break;
            } 
        }
        if(rowTobeChecked == -1 ) return false;
        int start = 0 ;
        int end = matrix[0].length-1;
        // System.out.println(rowTobeChecked);

        while(start<=end){
            int mid = (start+end)/2;
            System.out.println(start + " ==== " + end + "=== " + matrix[rowTobeChecked][mid] );
            if(matrix[rowTobeChecked][mid] == target) return true;
            else if(matrix[rowTobeChecked][mid] < target){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}
