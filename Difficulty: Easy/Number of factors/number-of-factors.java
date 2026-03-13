class Solution {
    static int countFactors(int n) {
        // code here
        int count = 1;
        for(int i=2; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}