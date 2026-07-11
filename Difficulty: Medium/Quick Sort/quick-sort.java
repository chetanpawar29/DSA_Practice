class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low < high){
            int partition = partition(arr, low, high);
            
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivote = arr[low];
        int i=low;
        int j=high;
        
        while(i < j){
            while(arr[i] <= pivote && i<high){
                i++;
            }
            
            while(arr[j] > pivote && j > low){
                j--;
            }
            
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        
        return j;
    }
}