class Solution {
    int maxLen(int arr[]) {
        // code here
        int maxlen = 0;
        int n = arr.length;
        long sum = 0;
    
        Map<Long,Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            
            if(sum == 0){
                maxlen = Math.max(maxlen, i+1);
            }
            
            if(map.containsKey(sum)){
                int len = i-map.get(sum);
                 maxlen = Math.max(maxlen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            
        }
        
        return maxlen;
    }
}