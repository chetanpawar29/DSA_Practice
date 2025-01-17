class Solution {
    public boolean isPalindrome(int x) {
        int dup  = x;
        int rev = 0;
        
        if(dup>=0)
        {
            while(dup>0)
            {
                int digit = dup % 10;
                rev = rev*10 + digit;
                dup /= 10;

            }
            if(rev == x)
            {
                return true;
            }
        }
        return false;
        
    }
}