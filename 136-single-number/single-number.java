class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int value = map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],value);
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }

        return -1;
    }
}