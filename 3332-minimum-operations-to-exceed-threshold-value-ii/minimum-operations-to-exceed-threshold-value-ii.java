class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        // Add all elements to minHeap (use Long to prevent overflow)
        for (int num : nums) {
            minHeap.offer((long) num);
        }

        int operations = 0;

        // Keep merging until the smallest element in the heap is >= k
        while (minHeap.peek() < k) {
            // Always ensure at least two elements exist in the heap
            long x = minHeap.poll();
            long y = minHeap.poll();

            // Perform the transformation
            long newElement = (x * 2) + y;
            minHeap.offer(newElement);

            operations++;
        }

        return operations;
    }
}