class Solution {
    public void setZeroes(int[][] matrix) {
    
        boolean rows[] = new boolean[matrix.length];
        boolean cols[] = new boolean[matrix[0].length];
        
        //Check for values which are zero.
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++)
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                } 

        //Set values to zero.
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++)
                if(rows[i] || cols[j])
                    matrix[i][j] = 0;
        
    }
}
