class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low < high){
            int partIndex = partition(arr, low, high);
            quickSort(arr, low, partIndex-1);
            quickSort(arr, partIndex+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivote = arr[high];
        int i = low -1;
        
        for(int j=low; j<high; j++){
            if(arr[j] <= pivote){
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
}