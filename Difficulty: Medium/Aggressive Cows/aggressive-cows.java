// User function Template for Java
class Solution {
    
    public static boolean canPossible(int[] stalls,int dist, int cows){
        int n = stalls.length;
        int crtCows = 1;
        int lastPlacedCow = stalls[0];
        
        for(int i=1; i<n; i++){
            if(stalls[i] - lastPlacedCow >= dist){
                crtCows++;
                lastPlacedCow = stalls[i];
            }
            
            if(crtCows >= cows) return true;
        }
        return false;
    }
    
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        
        int limit = stalls[n-1]-stalls[0];
        for(int i=1; i<=limit; i++){
            if(canPossible(stalls, i, k) == false){
                return (i-1);
            }
        }
        return limit;
    }
}