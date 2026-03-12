class Solution {
    public int countDigits(int num) {
        // code here
        int count = 0;
        while(num > 0){
            count++;
            num = num /10;
        }

        return count;
    }
}
