// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        String rev = "";
        
        for(int i=s.length()-1; i>=0; i--){
            rev = rev+s.charAt(i);
        }
        
        return rev;
    }
}