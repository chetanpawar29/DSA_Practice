class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int arr[] = new int[n];
        int ans[] = new int[2];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    arr[i]++;
                }
            }
        }

        int index=0;
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }

        ans[0] = index;
        ans[1] = max;
        return ans;
    }
}