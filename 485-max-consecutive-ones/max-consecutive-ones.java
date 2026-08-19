class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i=0, j = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;

        while(j<n){
            if(nums[j] == 1){
                count++;
            }else{
                i=j;
                max = Math.max(max,count);
                count=0;
            }
            j++;
        }
        max = Math.max(max,count);
        return max;
    }
}