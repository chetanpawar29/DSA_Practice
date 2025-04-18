class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int nge[] = new int[n];

        Arrays.fill(nge, -1);

        for(int i=0; i<n; i++){
            for(int j=i+1; j<=i+n-1; j++){
                int index = j%n;

                if(nums[index] > nums[i]){
                    nge[i] = nums[index];
                    break;
                }
                nge[i] = -1;
            }
        }
        return nge;
    }
}