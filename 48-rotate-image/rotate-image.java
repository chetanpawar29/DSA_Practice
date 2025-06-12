class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp[][] = new int[n][n];

        for(int i=0; i<n; i++){
            int index = 0;
            for(int j=0; j<n; j++){
                temp[index][n-1-i] = matrix[i][j];
                index++;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}