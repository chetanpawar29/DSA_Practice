class Solution {
    public int pivotInteger(int n) {
        for(int i=1; i<=n; i++){
            int beforeSum = (i*(i+1))/2;
            int afterSum = 0;
            for(int j=i; j<=n; j++){
                afterSum += j;
            }
            if(beforeSum == afterSum){
                return i;
            }
        }
        return -1;
    }
}