class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, -1); // important for edge case when subarray starts from index 0

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;

            // Java's modulo can return negative numbers
            if (rem < 0) rem += k;

            if (preSum.containsKey(rem)) {
                if (i - preSum.get(rem) >= 2) {
                    return true;
                }
            } else {
                preSum.put(rem, i);
            }
        }

        return false;
    }
}
