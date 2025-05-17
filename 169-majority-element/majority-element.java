class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ctr1 = 0;
        int ele = 0;

        for(int i=0; i<n; i++){
            if(ctr1 == 0){
                ctr1 = 1;
                ele = nums[i];
            }else if(nums[i] == ele){
                ctr1++;
            }else{
                ctr1--;
            }
        }

        int ctr2 = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == ele) ctr2++;
        }

        if(ctr2 > n/2){
            return ele;
        }

        return -1;
    }
}