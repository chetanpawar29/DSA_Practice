

class Solution {
    static long prodTwoDigit(long N) {
        // code here
        long MOD = 1000000007;
        String numStr = String.valueOf(N);
        long prod = 1;
        
        if (numStr.length() % 2 != 0) {
            numStr = "0" + numStr;
        }
        
        for(int i=0; i<numStr.length(); i+=2){
            int towDigitNo = Integer.parseInt(numStr.substring(i, i+2));
            prod = (prod * towDigitNo) % MOD;
        }
        return prod;
    }
};