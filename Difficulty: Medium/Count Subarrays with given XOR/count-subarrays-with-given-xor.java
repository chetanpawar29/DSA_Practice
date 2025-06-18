class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        int xor = 0;
        int count = 0;
    
        Map<Integer,Integer> map = new HashMap<>();
        
        map.put(xor, 1);
        
        for(int i=0; i<n; i++){
            xor = xor ^ arr[i];
            
            int x = xor ^ k;
            
            if(map.containsKey(x)){
                count += map.get(x);
                
            }
            
            if(map.containsKey(xor)){
                int value = map.getOrDefault(xor,0);
                map.put(xor,value+1);
            }else{
                map.put(xor, 1);
            }
        }
        
        return count;
    }
}