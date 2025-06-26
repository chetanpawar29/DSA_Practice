// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int n = arr.size();
        int count = 0;
        
        int low = 0;
        int high = n-1;
        
        while(low <= high){
            int mid = (low+high)/2;
            
            if((arr.get(low) <= arr.get(mid)) && (arr.get(mid) <= arr.get(high))){
                break;
            }else{
                count++;
                low++;
            }
        }
        
        return count;
    }
}