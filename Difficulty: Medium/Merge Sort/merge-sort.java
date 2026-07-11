class Solution {
    public void mergeSort(int arr[], int l, int r) {
        // code here
        int n = arr.length;
        
        if(l>=r ) return ;
        int mid = (l+r)/2;
        
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, n, l, mid, r);
    }
    
    public void merge(int arr[], int n, int l, int mid, int r){
        List<Integer> list = new ArrayList<>();
        int i= l;
        int j = mid+1;
        
        while(i<=mid && j<=r){
            if(arr[i] <= arr[j]){
                list.add(arr[i]);
                i++;
            }else{
                list.add(arr[j]);
                j++;
            }
        }
        
        while(i<=mid){
            list.add(arr[i]);
            i++;
        }
        
        while(j<=r){
            list.add(arr[j]);
            j++;
        }
        
        for(int k=l; k<=r; k++){
            arr[k] = list.get(k-l);
        }
    }
}