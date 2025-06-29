class Solution {
    public int mySqrt(int n) {
        int ans = 0;
        int low = 1;
        int high = n;
        while(low <= high){
            long mid = (low+high)/2;
            if(mid <= (long) n/ mid){
                ans = (int) mid;
                low =(int) mid+1;
            }else{
                high = (int) mid-1;
            }
        }
        return ans;
    }
}