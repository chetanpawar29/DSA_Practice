// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] >= x){
                return i;
            }
        }
        return -1;
    }
    
}
