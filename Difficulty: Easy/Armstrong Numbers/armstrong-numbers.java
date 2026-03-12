// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        
        int original = n;
        int armstong = 0;
        
        while(n > 0){
            int last = n%10;
            armstong += Math.pow(last, 3);
            n = n / 10;
        }
        
        if(original == armstong){
            return true;
        }
        
        return false;
    }
}