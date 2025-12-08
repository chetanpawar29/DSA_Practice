
import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int min = -1;
        
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] >= min){
                list.add(arr[i]);
                min = arr[i];
            }
        }
        
        Collections.reverse(list);
        
        return list;
        
    }
}
