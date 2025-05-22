class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int n = arr.length;
        int count = 0;
        int i=0, j=1;
        
        while(i<n && j<n){
            if(arr[i] != arr[j]){
                int temp = arr[i+1];
                arr[i+1] = arr[j];
                arr[j] = temp;
                
                i++;
                j++;
            }else{
                count++;
                j++;
            }
        }
        
        return n-count;
    }
}