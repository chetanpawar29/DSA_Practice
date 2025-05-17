class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int ctr0 = 0, ctr1 = 0, ctr2 = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                ctr0++;
            }else if(nums[i] == 1){
                ctr1++;
            }else{
                ctr2++;
            }
        }

        for(int i=0; i<ctr0; i++){
            nums[i] = 0;
        }

        for(int i=ctr0; i<ctr0+ctr1; i++){
            nums[i] = 1;
        }

        for(int i=ctr0+ctr1; i<n; i++){
            nums[i] = 2;
        }

    }
}