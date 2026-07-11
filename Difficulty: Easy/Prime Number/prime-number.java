class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n == 1) return false;
        boolean isPrime = true;
        
        for(int i=2; i<n; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        
        return isPrime;
    }
}