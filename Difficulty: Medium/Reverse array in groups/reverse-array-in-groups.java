class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        for(int i=0; i<n; i+=k){
            if(n >= i+k){
                reverseArr(arr, i, i+k-1);
            }else{
                reverseArr(arr, i, n-1);
            }
        }
    }
    
    public void reverseArr(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        
    }
}