class Solution {
    public int countDigits(int num) {
        int original = num;
        int count = 0;
        while(num > 0){
            int last = num % 10;
            if(original % last == 0){
                count++;
            }
            num = num /10;
        }

        return count;
    }
}