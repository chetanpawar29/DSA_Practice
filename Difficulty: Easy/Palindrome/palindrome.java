class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int dup = n;
        int rev = 0;
        while(dup > 0){
            int dig = dup % 10;
            rev = rev * 10 + dig; // 123 -> 3 -> 0*10+3=3 -> 3*10+2
            dup = dup/10;
        }
        
        if(rev == n){
            return true;
        }
        
        return false;
    }
}