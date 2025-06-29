class Solution {
    int floorSqrt(int n) {
        // code here
        int ans = 0;
        for(int i=1; i<=n; i++){
            long val = i * i;
            if(val <= (long) n){
                ans = i;
            }else{
                break;
            }
        }
        return ans;
    }
}