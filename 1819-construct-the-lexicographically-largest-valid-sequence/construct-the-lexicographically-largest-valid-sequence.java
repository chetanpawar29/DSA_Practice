class Solution {
    public int[] constructDistancedSequence(int n) {
        int size = 2 * n - 1;
        int[] result = new int[size]; // Initialize sequence
        boolean[] used = new boolean[n + 1]; // To track used numbers

        backtrack(result, used, 0, n);
        return result;
    }

    private boolean backtrack(int[] result, boolean[] used, int index, int n) {
        if (index == result.length) {
            return true; // Sequence is complete
        }

        if (result[index] != 0) {
            return backtrack(result, used, index + 1, n); // Skip filled positions
        }

        for (int num = n; num >= 1; num--) { // Try larger numbers first
            if (used[num]) continue; // Skip already used numbers

            if (num == 1) { // Place 1 (appears once)
                result[index] = 1;
                used[num] = true;
                if (backtrack(result, used, index + 1, n)) return true;
                result[index] = 0; // Backtrack
                used[num] = false;
            } else {
                int secondIndex = index + num;
                if (secondIndex < result.length && result[secondIndex] == 0) {
                    result[index] = result[secondIndex] = num;
                    used[num] = true;
                    if (backtrack(result, used, index + 1, n)) return true;
                    result[index] = result[secondIndex] = 0; // Backtrack
                    used[num] = false;
                }
            }
        }

        return false;
    }
}