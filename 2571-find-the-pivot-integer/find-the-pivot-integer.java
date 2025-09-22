class Solution {
    public int pivotInteger(int n) {

        int totalSum = (n*(n+1))/2;

        for(int i=1; i<=n; i++){
            int beforeSum = (i*(i+1))/2;
            int afterSum = totalSum - beforeSum + i;
            if(beforeSum == afterSum){
                return i;
            }
        }
        return -1;
    }
}