class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[low] <= nums[high]){
                min = Math.min(min, nums[low]);
                break;
            }

            if(nums[low] <= nums[mid]){
                min = Math.min(min, nums[low]);
                low = mid+1;
            }else{
                min = Math.min(min, nums[low]);
                high = high-1;
            }
        }

        return min;
    }
}