// User function Template for Java

class Solution {
    int calSum(int arr[], int i){
        if(i==0){
            return arr[0];
        }
        return arr[i]+calSum(arr, i-1);
    }
    int arraySum(int arr[]) {
        // code here
        return calSum(arr, arr.length-1);
    }
}
