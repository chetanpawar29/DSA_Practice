class Solution {
    public int firstOccurance(int[] nums, int target)
    {
        int first = -1;
        int high = nums.length-1;
        int low = 0;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid-1;
            }else if(nums[mid] > target){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return first;
    }
    public int lastOccurance(int[] nums, int target)
    {
        int last = -1;
        int high = nums.length-1;
        int low = 0;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                last = mid;
                low = mid+1;
            }else if(nums[mid] > target){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurance(nums, target);
        int last = lastOccurance(nums, target);

        return new int[]{first, last};
    }
}