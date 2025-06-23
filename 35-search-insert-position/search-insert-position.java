class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int index = n;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                index = mid;
                return index;
            }else if(nums[mid] > target){
                index = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return index;
    }
}