class Solution {
    
    public int getNum(char s){
        switch(s){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        
        return 0;
    }
    public int romanToDecimal(String s) {
        // code here
        int n = s.length();
        int sum = 0;
        int i=0;
        
        while(i < n-1){
            int current = getNum(s.charAt(i));
            int next = getNum(s.charAt(i+1));
            if(current < next){
                sum-=current;
            }else{
                sum+=current;
            }
            i++;
        }
        sum+=getNum(s.charAt(n-1));
        
        return sum;
    }
    
}