class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(isPrime(i)){
                    list.add(i);
                }
                
                if(i != n/i){
                if(isPrime(n/i)){
                    list.add(n/i);
                }
            }
            }
        }
        Collections.sort(list);
        return list;
    }
    
    public static boolean isPrime(int n){
        int count =0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                count++;
                if(i != n/i){
                    count++;
                }
            }
        }
        if(count == 2){
            return true;
        }
        
        return false;
    }
}