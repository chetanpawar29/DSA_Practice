class Solution {
    public int findDays(int[] wt, int cap, int n){
        int days = 1;
        int load = 0;

        for(int i=0; i<n; i++){
            if(load+wt[i] > cap){
                days++;
                load = wt[i];
            }else{
                load+=wt[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] wt, int days) {
        int n = wt.length;
        int ans = 0;
        int min = wt[0];
        int sum = 0;
         for(int i=0; i<n; i++){
            min = Math.max(min, wt[i]);
            sum+=wt[i];
         }

         int low = min;
         int high = sum;

          while(low <= high){
            int cap = (low+high)/2;

            int reqDays = findDays(wt, cap, n);

            if(reqDays <= days){
                ans = cap;
                high = cap - 1;
            }else{
                low = cap+1;
            }
          }
          return ans;
    }
}