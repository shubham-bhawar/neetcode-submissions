class NumMatrix {
    int [][] prefixSum ;
    public NumMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            // Loop through all columns in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Print each element followed by a space
                System.out.print(matrix[i][j] + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
        System.out.println();
        int row = matrix.length;
        int col = matrix[0].length;
        int res;

        prefixSum = new int [row][col];
        for(int i = 0;i<row;i++){
            res =0;
            for(int j = 0;j<col;j++){
                res+=matrix[i][j];
                prefixSum[i][j]=res;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            // Loop through all columns in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // Print each element followed by a space
                System.out.print(prefixSum[i][j] + " ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum =0;
                    
        for(int i = row1 ; i<= row2; i++){
            sum+=prefixSum[i][col2];
            if(col1>0){
                sum-=prefixSum[i][col1-1];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */