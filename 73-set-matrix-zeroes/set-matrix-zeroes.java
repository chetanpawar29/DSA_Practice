class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> row = new LinkedList<>();
        List<Integer> column = new LinkedList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                   row.add(i);
                   column.add(j);
                }
            }
        }
        for(int ele : row){
            for(int i=0; i<n; i++){
                matrix[ele][i] = 0;
            }
        }
        for(int ele : column){
            for(int j=0; j<m; j++){
                matrix[j][ele] = 0;
            }
        }
    }
}