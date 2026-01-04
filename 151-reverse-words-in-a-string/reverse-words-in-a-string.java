class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String arr[] = s.split("\\s+");
        int n = arr.length;

        int i=0;
        int j=n-1;

        while(i <= j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder(arr[0]);

        for(i=1; i<n; i++){
           
            sb.append(" ");
            sb.append(arr[i]);
            
            
        }

        return sb.toString();
    }
}