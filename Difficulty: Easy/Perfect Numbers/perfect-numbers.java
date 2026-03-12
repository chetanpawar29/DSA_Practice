class Solution {
    static boolean isPerfect(int n) {
        // code here
        int sum = 1;
        for(int i=2; i*i<=n; i++){
            if(n%i == 0){
                sum += i;
            
                if(i != n/i){
                    sum+=n/i;
                }
            }
        }
        
        if(n == sum){
            return true;
        }
        
        return false;
    }
}