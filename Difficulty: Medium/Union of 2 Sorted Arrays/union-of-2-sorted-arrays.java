class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        
        int i=0, j=0;
        
        while(i<n && j<m){
            if(a[i] == b[j]){
                if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
                j++;
            }else if(a[i] < b[j]){
                if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }else{
                if(list.isEmpty() || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        
        while(i<n){
            if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
        }
        
        while(j<m){
            if(list.isEmpty() || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
        }
        
        return list;
    }
}
