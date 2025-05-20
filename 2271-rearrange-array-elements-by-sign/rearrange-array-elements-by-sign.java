class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int a1[] = new int[n/2];
        int a2[] = new int[n/2];
        int index1 = 0;
        int index2 = 0;

        for(int i=0; i<n; i++){
            if(nums[i] >= 0){
                a1[index1++] = nums[i];
            }else{
                a2[index2++] = nums[i];
            }
        }
        index1 = 0;
        index2 = 0;
        for(int i=0; i<n; i++){
            if(i%2 == 0){
               nums[i] = a1[index1++];
            }else{
                nums[i] = a2[index2++];
            }
        }
        return nums;
    }
}