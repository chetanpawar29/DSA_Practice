class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count++;

                // If more than one violation → not possible
                if (count > 1) return false;

                // Decide which element to remove
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1]; // remove current element
                }
                // else: remove previous element (do nothing)
            }
        }
        return true;
    }
}