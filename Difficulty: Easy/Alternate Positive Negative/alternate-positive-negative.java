// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pov = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int ele : arr){
            if(ele >= 0){
                pov.add(ele);
            }else{
                neg.add(ele);
            }
        }
        int i=0, j=0;
        int n = pov.size(), m = neg.size();
        int index=0;
        
        while(i<n && j<m){
            if(index%2==0){
                arr.set(index++, pov.get(i));
                i++;
            }else{
                arr.set(index++, neg.get(j));
                j++;
            }
        }
        while(i<n){
            arr.set(index++, pov.get(i));
            i++;
        }
        while(j<m){
            arr.set(index++, neg.get(j));
                j++;
        }
        
    }
}