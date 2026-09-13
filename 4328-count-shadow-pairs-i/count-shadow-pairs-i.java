class Solution {
    public long shadowPairs(int[] nums) {
        int n = nums.length;
        long count = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(!list.isEmpty()){
                count+= checkLessElement(list, 0, list.size()-1, nums[i]);
            }
            while(!list.isEmpty() && list.get(list.size()-1)>nums[i]){
                list.remove(list.size()-1);
            }
            list.add(nums[i]);
        }
        return count;
    }

    public int checkLessElement(List<Integer> list, int low, int high, int target){
        int index = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if(list.get(mid) < target){
                index = mid+1;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return index;
    }
}