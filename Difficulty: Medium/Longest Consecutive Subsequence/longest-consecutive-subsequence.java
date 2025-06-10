class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n = arr.length;
        int longest = 1;
        int count;
        
        for(int i=0; i<n; i++){
            count = 1;
            int x= arr[i];
            
            while(linearSearch(arr, x+1) == true){
                count++;
                x+=1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    
    public static boolean linearSearch(int arr[], int k){
        for(int n : arr){
            if(n==k){
                return true;
            }
        }
        return false;
    }
}