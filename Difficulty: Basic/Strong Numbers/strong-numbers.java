// User function Template for Java

class Solution {
    static int isStrong(int N) {
        // code here
        int ori = N;
        int sum = 0;
        
        while(N > 0){
            int last = N %10;
            sum= sum + findFactorial(last);
            N = N/10;
        }
        
        if(sum == ori){
            return 1;
        }
        
        return 0;
    }
    
    static int findFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        
        return n * findFactorial(n-1);
    }
};