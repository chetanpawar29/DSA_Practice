class Solution {
    static int RecursivePower(int n, int p) {
        // Code here
        if(p == 0){
            return 1;
        }
        return n*RecursivePower(n,p-1);
    }
}
