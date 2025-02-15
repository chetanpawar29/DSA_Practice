class Solution {
    public int punishmentNumber(int n) {
     int totalPunishment = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            String squareStr = String.valueOf(square);
            
            if (isValidPartition(squareStr, i, 0, 0)) {
                totalPunishment += square;
            }
        }
        
        return totalPunishment;
    }

    private static boolean isValidPartition(String s, int target, int index, int sum) {
        // Base case: If we reach the end of the string, check if the sum equals the target
        if (index == s.length()) {
            return sum == target;
        }
        
        // Try all possible partitions
        int num = 0;
        for (int i = index; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0'); // Convert substring to number
            
            if (sum + num > target) break; // Pruning: Stop if sum exceeds target
            
            if (isValidPartition(s, target, i + 1, sum + num)) {
                return true; // If any partition works, return true
            }
        }
        return false;
    }
}