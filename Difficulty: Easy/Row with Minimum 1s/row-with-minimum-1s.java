class Solution {
    int minRow(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    arr[i]++;
                }
            }
        }

        int index=0;
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index+1;
    }
};