//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();

            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            line = read.readLine();
            tokens = line.split(" ");
            for (String token : tokens) {
                array2.add(Integer.parseInt(token));
            }

            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr1 = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr1[idx++] = i;

            int[] arr2 = new int[array2.size()];
            idx = 0;
            for (int i : array2) arr2[idx++] = i;

            v = new Solution().intersection(arr1, arr2);

            if (v.size() > 0) {
                for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");
            } else {
                System.out.print("[]");
            }

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> intersection(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = a.length;
        int m = b.length;
        
        int i=0, j=0;
        
        while(i<n && j<m)
        {
            if(a[i] == b[j])
            {
                if(list.isEmpty() || list.get(list.size()-1) != a[i])
                {
                    list.add(a[i]);
                }
                i++;
                j++;
            }else if(a[i] < b[j])
            {
                i++;
            }else{
                j++;
            }
        }
       
        
        return list;
    }
}
