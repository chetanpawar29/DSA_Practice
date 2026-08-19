class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int k = -1;
        for(int i=0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                k = i;
            }
        }
        if(k == -1) return true;
        rotate(nums, 0, k);
        rotate(nums, k+1, n-1);
        rotate(nums, 0, n-1);

        for(int i=0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public void rotate(int nums[], int i, int j){
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}