class Solution {
    int missingNum(int nums[]) {
        // code here
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }

        return n+1;
    }
}