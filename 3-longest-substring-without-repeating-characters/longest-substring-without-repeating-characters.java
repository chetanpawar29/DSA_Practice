class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int hashArr[] = new int[256];
        Arrays.fill(hashArr, -1);

        int l=0, r=0;

        while(r < n){
            if(hashArr[s.charAt(r)] != -1 && hashArr[s.charAt(r)] >= l){
                l = hashArr[s.charAt(r)] + 1;
            }
            maxLen = Math.max(maxLen, r-l+1);
            hashArr[s.charAt(r)] = r;

            r++;
        }

        return maxLen;
    }
}