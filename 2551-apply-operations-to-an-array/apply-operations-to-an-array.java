class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
        }

        int i=0; 
        for(int j=0; j<n; j++){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
            }
        }

        return nums;
    }
}