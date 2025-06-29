// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        for(long i=1; i<=m; i++){
            int count=0;
            long val = 1;
            while(count < n){
                val *= i;
                count++;
            }
            
            if(val == (long) m){
                return (int) i;
            }else if(val > (long) m){
                break;
            }
        }
        return -1;
    }
}