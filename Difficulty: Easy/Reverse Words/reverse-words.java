class Solution {
    public String reverseWords(String s) {
        // Code here
        String strArr[] = s.split("\\.");
        
        int n = strArr.length;
        int i=0, j=n-1;
        
        while(i < j){
            String str = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = str;
            
            i++;
            j--;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(i=0; i<n; i++){
            if(i!=0 && !strArr[i].isEmpty()){
                sb.append(".");
            }
            sb.append(strArr[i]);
        }
        
        return sb.toString();
        
    }
}
