class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int ori = n;
        int rev = 0;
        while(n > 0){
            int ld = n%10;
            rev = rev*10+ld;
            n = n/10;
        }
        
        return (int) Math.pow(ori, rev);
    }
}
