class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int n = arr.length;
        
        int i=0; 
        int j=1;
        
        while(j<n){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
                j++;
            }else{
                j++;
                
            }
        }
        return i+1;
    }
}