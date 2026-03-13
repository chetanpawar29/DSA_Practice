// User function Template for Java

class Solution {
    public boolean isPrime(int n){
        int count = 0;
        
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
    
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=M; i<=N; i++){
            if(i%2==0 && i!=2){
                continue;
            }
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }
}