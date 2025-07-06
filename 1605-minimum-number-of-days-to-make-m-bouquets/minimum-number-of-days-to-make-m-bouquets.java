class Solution {

    public long findMin(int[] bloomDay, int n){
        long min = Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(min, bloomDay[i]);
        }
        return min;
    }

    public long findMax(int[] bloomDay, int n){
        long max = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, bloomDay[i]);
        }
        return max;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if(n < m*k) return -1;

        int low = (int) findMin(bloomDay, n);
        int high = (int) findMax(bloomDay, n);
        int ans = -1;

        while(low <= high){
            long day = (low+high)/2;
            long bouquets = 0; long count = 0;
            for(int j=0; j<n; j++){
                if(day >=(long) bloomDay[j]){
                    count++;
                }else{
                    bouquets += count/k;
                    count = 0;
                }
            }
            bouquets += count/k;
            if(bouquets >= m){
                ans = (int) day;
                high =(int) day-1;
            }else{
                low = (int)day+1;
            }
        }

        return ans;
    }
}