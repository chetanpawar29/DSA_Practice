// User function Template for Java
class Solution {
    
    static boolean isPerfectSqu(int x){
        int s = (int) Math.sqrt(x);
        return s*s == x;
    }
    static String checkFibonacci(int n) {
        // code here
        if(isPerfectSqu(5*n*n+4) || isPerfectSqu(5*n*n-4)){
            return "Yes";
        }
        
        return "No";
    }
}
