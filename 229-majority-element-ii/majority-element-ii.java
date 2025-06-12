class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int n = nums.length;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=i; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/3 && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}