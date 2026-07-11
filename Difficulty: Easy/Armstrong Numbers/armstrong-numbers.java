
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int dup = n;
        int sum = 0;
        
        while(dup > 0){
            int lastDigit = dup % 10;
            sum+= Math.pow(lastDigit, 3);
            dup/=10;
        }
        
        return n == sum;
    }
}