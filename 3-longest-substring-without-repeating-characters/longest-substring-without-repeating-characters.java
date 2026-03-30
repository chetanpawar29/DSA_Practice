class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        for(int i=0; i<n; i++){
            int hashArr[] = new int[256];
            for(int j=i; j<n; j++){
                if(hashArr[s.charAt(j)] == 1) break;
                maxLen = Math.max(maxLen, j-i+1);
                hashArr[s.charAt(j)] = 1;
            }
        }

        return maxLen;
    }
}