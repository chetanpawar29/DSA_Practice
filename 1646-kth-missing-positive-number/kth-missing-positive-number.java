class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int max = arr[0];
        for(int i=0; i<n; i++){
           max = Math.max(max, arr[i]);
        }

        int hashArr[] = new int[max+k+1];

        for(int i=0; i<n; i++){
           hashArr[arr[i]]++;
        }

        int count = 1;
        for(int i=1; i<hashArr.length; i++){
           if(hashArr[i] == 0){
                if(count == k){
                    return i;
                }
                count++;
           }
        }
        return -1;
    }
}