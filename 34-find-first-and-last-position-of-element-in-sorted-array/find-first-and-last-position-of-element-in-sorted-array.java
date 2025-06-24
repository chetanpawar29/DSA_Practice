class Solution {
    
    public int firstOccurance(int nums[],int n, int x){
        int low = 0;
        int high = n-1;
        int first = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == x){
                first = mid;
                high = mid-1;
            }else if(nums[mid] > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return first;
    }

    public int lastOccurance(int nums[],int n, int x){
        int low = 0;
        int high = n-1;
        int last = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == x){
                last = mid;
                low = mid+1;
            }else if(nums[mid] > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int first = firstOccurance(nums, n, target);
        int last = lastOccurance(nums, n, target);

        int arr[] = {first, last};

        return arr;
        
    }
}