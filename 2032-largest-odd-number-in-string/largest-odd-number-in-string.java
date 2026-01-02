class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int index = -1;

        for (int i = n - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if (ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9') {
                index = i;
                break;
            }
        }

        return (index == -1) ? "" : num.substring(0, index + 1);
    }
}