class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        Map<Integer,Integer> map = new HashMap<>();

        for(int ele : nums){
            int value = map.getOrDefault(ele, 0);
            map.put(ele, value+1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > n/3){
                list.add(e.getKey());
            }
        }
        return list;
    }
}