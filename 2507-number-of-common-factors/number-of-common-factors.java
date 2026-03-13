class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        for(int i=Math.min(a,b); i>=1; i--){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}