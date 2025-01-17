//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            int ans = ob.sumOfDivisors(N);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int sumOfDivisors(int n) {
        // code here
        int sum = 0;
        
        for(int i=1; i<=n; i++)
        {
            int currSum = 0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                {
                    currSum +=j;
                }
            }
            sum += currSum;
        }
        
        return sum;
    }
}