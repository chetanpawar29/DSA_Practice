class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value+1);
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }
        return -1;
    }
}