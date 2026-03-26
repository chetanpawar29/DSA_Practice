class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int n = s.length();

        int hashArr[] = new int[256];

        Arrays.fill(hashArr, -1);
        int l = 0, r = 0;

        while(r < n){
            int index = s.charAt(r);
            if(hashArr[index] != -1 && hashArr[index] >= l){
                l = hashArr[index] + 1;
            }
             int len = r-l+1;
             maxLen = Math.max(maxLen, len);
             hashArr[index] = r;
             r++;
        }

        return maxLen;
    }
}