class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = piles[0];
        for(int i=0; i<n; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }
        int ans = 0;
        int low = 0;
        int high = max;
        while(low <= high){
            int mid = (low+high)/2;
            int totalTime = 0;
            for(int i=0; i<n; i++){
                totalTime += Math.ceil((double)piles[i]/(double)mid);
            }
            if(totalTime <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}