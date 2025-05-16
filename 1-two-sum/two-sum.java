class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int arr[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                arr[0] = map.get(rem);
                arr[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return arr;
    }
}