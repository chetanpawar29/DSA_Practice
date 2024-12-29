//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution sol = new Solution();
            ArrayList<Integer> res = sol.intersectionWithDuplicates(a, b);

            // Sort the result
            Collections.sort(res);

            // Print the result
            if (res.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int num : res) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        
       Arrays.sort(a); // Sort both arrays
        Arrays.sort(b);

        ArrayList<Integer> list = new ArrayList<>();
        int n = a.length, m = b.length;
        int i = 0, j = 0;

        Integer prev = null; // Tracker to avoid duplicates in the result

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (prev == null || a[i] != prev) {
                    list.add(a[i]);
                    prev = a[i]; // Update the tracker
                }
                i++;
                j++;
            }
        }
        
        return list;
        
        
        
        
        
        
        
        
        
        // code here
        // int n1 = a.length;
        // int n2 = b.length;
        // int max = Integer.MIN_VALUE;
        // ArrayList<Integer> list = new ArrayList<Integer>();
        
        // for(int i=0; i<n1; i++)
        // {
        //     if(max < a[i])
        //     {
        //         max = a[i];
        //     }
        // }
        // int visited[] = new int[max+1];
        // for(int i=0; i<=max; i++)
        // {
        //     visited[i] = 0;
        // }
        
        // for(int i=0; i<n1; i++)
        // {
            
        //     for(int j=0; j<n2; j++)
        //     {
        //         if(a[i] == b[j] && visited[a[i]] ==0)
        //         {
        //             list.add(a[i]);
        //             visited[a[i]] = 1;
        //             break;
        //         }
        //     }
        // }
        // return list;
        
        
        
        
    }
}