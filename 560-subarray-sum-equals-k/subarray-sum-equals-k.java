class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        
        Map<Long, Integer> preSum = new HashMap<>();
        long sum = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            sum += nums[i];

            if(sum == k){
                count++;
            }

            long rem = sum - k;

            if(preSum.containsKey(rem)){
                count+= preSum.get(rem);
            }

           
            preSum.put(sum, preSum.getOrDefault(sum, 0)+1);
           
        }

        return count;
    }
}