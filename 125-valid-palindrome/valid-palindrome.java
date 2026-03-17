class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        
        return true;
    }
}