class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int index = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--){
            if(arr[i] >= target){
                index = Math.min(index, i);
            }
        }
        return (index != Integer.MAX_VALUE)? index : n;
        
        
        
    }
}
