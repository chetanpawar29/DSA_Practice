// User function Template for Java
class Solution {
    public int[] leastPrimeFactor(int n) {
        // code here
        int arr[] = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = i;
        }
        
        for(int i=2; i*i<=n; i++){
            if(arr[i] == i){
                for(int j=i*i; j<=n; j+=i){
                    if(arr[j] == j){
                        arr[j] = i;
                    }
                }
            }
        }
        return arr;
    }
}