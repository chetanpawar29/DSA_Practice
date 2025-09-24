class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;

        for(int i=0; i<nums.length; i++){
            eleSum += nums[i];
            int num = nums[i];
            while(num > 0){
                int rem = num % 10;
                digitSum += rem;
                num /= 10;
            }
        }
        return Math.abs(eleSum - digitSum);
    }
}