class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int hash[] = new int[n+1];

        for(int i=0; i<n; i++){
            hash[nums[i]]++;
        }

        for(int i=0; i<n+1; i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return 0;
    }
}