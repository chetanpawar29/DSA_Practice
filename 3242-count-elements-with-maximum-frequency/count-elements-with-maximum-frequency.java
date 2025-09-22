class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i], value+1);
        }

        int sum = 0;
        int ele = 0;

        for(Integer i : map.values()){
            if(i > ele){
                sum = i;
                ele = i;
            }else  if(i == ele){
                sum += i;
            }
        }
        return sum;
    }
}