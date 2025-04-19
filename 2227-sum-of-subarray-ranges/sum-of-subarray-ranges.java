class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        long maxSum = 0, minSum = 0;

        Stack<Integer> stack = new Stack<>();

        // For max contribution
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] < nums[i])) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                long count = (mid - left) * (long)(i - mid);
                maxSum += nums[mid] * count;
            }
            stack.push(i);
        }

        stack.clear();

        // For min contribution
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || nums[stack.peek()] > nums[i])) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                long count = (mid - left) * (long)(i - mid);
                minSum += nums[mid] * count;
            }
            stack.push(i);
        }

        return maxSum - minSum;
    }
}
