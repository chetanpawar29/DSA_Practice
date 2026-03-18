class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;
        for(int i=0; i<k; i++){
            lSum += arr[i];
        }
        maxSum = lSum;

        int index = n-1;

        for(int i=k-1; i>=0; i--){
            lSum -= arr[i];
            rSum += arr[index];
            index--;

            maxSum = Math.max(maxSum, lSum+rSum);
        }
        return maxSum;
    }
}