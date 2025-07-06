class Solution {
    public long findMin(int[] nums, int n){
        long min = Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    public long findMax(int[] nums, int n){
        long max = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }


    public int smallestDivisor(int[] nums, int threshold) {
         int n = nums.length;

        int low = 1;
        int high = (int) findMax(nums, n);
        int ans = -1;

        while(low <= high){
            long day = (low+high)/2;
            int sum = 0;
            for(int i=0; i<n; i++){
                sum+= Math.ceil((double)nums[i]/ (double) day);
            }
            if(sum <= threshold){
                ans = (int) day;
                high =(int) day-1;
            }else{
                low =(int) day+1;
            }
        }

        return ans;
    }
}