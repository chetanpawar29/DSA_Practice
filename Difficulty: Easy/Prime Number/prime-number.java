class Solution {
    static boolean isPrime(int n) {
        // code here
        int count = 0;
        
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                count++;
                
                if(i != n/i){
                    count++;
                }
            }
            
        }
        
        if(count == 2){
            return true;
        }
        
        return false;
    }
}