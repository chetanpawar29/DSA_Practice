class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int maxLen = 0;
        int n = s.length();

        for(int i=0; i<n; i++){
            int hashArr[] = new int[256];
            for(int j=i; j<n; j++){
                if(hashArr[s.charAt(j)] == 1) break;
                int len = j-i+1;
                maxLen = Math.max(maxLen, len);
                hashArr[s.charAt(j)] = 1;
            }
        }

        return maxLen;
    }
}