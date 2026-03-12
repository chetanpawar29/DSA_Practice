class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        if(n == 1 || n == 0){
            return n;
        }
        
        return n * factorial(n-1);
    }
}
