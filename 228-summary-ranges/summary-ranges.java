class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        int start = 0;
        while(start < n){
            int end = start;

            while(end+1 < n && nums[end+1] == nums[end]+1){
                end++;
            }

            if(start == end){
                list.add(String.valueOf(nums[start]));
            }else{
                list.add(nums[start]+"->"+nums[end]);
            }
            start = end+1;
        }


        return list;
    }
}