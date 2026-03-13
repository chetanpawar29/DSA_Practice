class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i; j<arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}