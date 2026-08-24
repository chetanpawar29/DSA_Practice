class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{i, map.get(rem)};

            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}