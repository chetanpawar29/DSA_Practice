class Solution {
    public static boolean canPossible(int[] position,int dist, int k){
        int n = position.length;
        int crtbolls = 1;
        int lastPlacedball = position[0];
        
        for(int i=1; i<n; i++){
            if(position[i] - lastPlacedball >= dist){
                crtbolls++;
                lastPlacedball = position[i];
            }
            
            if(crtbolls >= k) return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int k) {
        int n = position.length;
        Arrays.sort(position);
        
        int high = position[n-1]-position[0];
        int low = 1;
        
        while(low <= high){
            int mid = (low+high)/2;
            if(canPossible(position, mid, k) == true){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        
        return high;
    }
}