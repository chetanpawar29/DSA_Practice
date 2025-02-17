class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26]; // Frequency array for letters A-Z
        for (char c : tiles.toCharArray()) {
            freq[c - 'A']++;
        }
        return backtrack(freq);
    }

    private int backtrack(int[] freq) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) { // If this letter is available
                count++; // Count current sequence
                freq[i]--; // Use this letter
                
                count += backtrack(freq); // Explore further
                
                freq[i]++; // Restore the count (backtrack)
            }
        }
        return count;
    } 
}
