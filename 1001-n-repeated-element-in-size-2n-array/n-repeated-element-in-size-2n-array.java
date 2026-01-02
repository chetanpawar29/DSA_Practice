class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int val = map.getOrDefault(nums[i], 0);

            if(val > 0){
                return nums[i];
            }
            map.put(nums[i], val+1);
        }

        return -1;
    }
}