class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
        int n = arr.length;
        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i] <= x){
                index = i;
            }
        }
        return index;
    }
}
