class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int n = s.length();
        int hashArr[] = new int[26];
        
        for(int i=0; i<n; i++){
            hashArr[s.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<n; i++){
            if(hashArr[s.charAt(i) - 'a'] == 1){
                return (char) ('a' + (s.charAt(i) - 'a'));
            }
            
            
        }
        return '$';
    }
}
