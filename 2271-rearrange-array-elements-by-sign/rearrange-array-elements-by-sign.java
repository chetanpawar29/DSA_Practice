class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int pov = 0; int neg = 1;

        for(int i=0; i<n; i++){
            if(nums[i] >= 0){
                result[pov] = nums[i];
                pov+=2;
            }else{
                result[neg] = nums[i];
                neg+=2;
            }
        }

        return result;
    }
}