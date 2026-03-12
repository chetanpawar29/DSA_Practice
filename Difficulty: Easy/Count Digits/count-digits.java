class Solution {
    public int countDigits(int num) {
        // code here
        if(num == 0){
            return 0;
        }
        return 1+countDigits(num/10);
    }
}
