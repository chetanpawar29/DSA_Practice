// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int hashArr[] = new int[n+1];
        for(int i=0; i<n; i++){
            hashArr[arr[i]]++;
        }
        
        for(int i=1; i<n+1; i++){
            if(hashArr[i] == 2){
                list.add(i);
            }
        }
        for(int i=1; i<n+1; i++){
            if(hashArr[i] == 0){
                list.add(i);
            }
        }
        return list;
    }
}
