// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++){
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val+1);
        }
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        
        return 0;
    }
}
