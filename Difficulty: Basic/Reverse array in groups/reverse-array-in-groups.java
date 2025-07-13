class Solution {
    
    public void reverseSubArray(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k >= n){
            reverseSubArray(arr,0,n-1);
            return;
        }
        
        int i=0;
        
        while(i<n){
            if(i+k <= n){
                reverseSubArray(arr, i, i+k-1);
            } 
            else if(i+k > n){
                reverseSubArray(arr, i, n-1);
            }
            i+=k;
        }
        
    }
}