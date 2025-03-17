//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends




// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        {
            if(i+1 != arr[i])
            {
                return i+1;
            }
        }
        
        return arr.length+1;
    }
}