//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
       int largest=arr[0], slargest=-1;
       
       //find largest element
       for(int i=0; i<arr.length; i++)
       {
           if(largest < arr[i])
           {
               largest = arr[i];
           }
       }
       
       //find second largest
       for(int i=0; i<arr.length; i++)
       {
           if(slargest < arr[i] && arr[i] != largest)
           {
               slargest = arr[i];
           }
       }
       
       
       return slargest;
    }
}