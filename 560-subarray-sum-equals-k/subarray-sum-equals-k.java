class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        long sum =0;

        HashMap<Long, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum == k){
                count++;
            }

            long rem = sum - k;

            if(map.containsKey(rem)){
                count += map.get(rem);
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}