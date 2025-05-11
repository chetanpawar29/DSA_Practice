class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int fMax = nums[n-1];
        int sMax = -1;
        int tMax = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] != fMax){
                sMax = nums[i];
                break;
            }
        }

        for(int i=n-3; i>=0; i--){
            if(nums[i] != sMax){
                return nums[i];
            }
        }

        

        return fMax;
    }
}