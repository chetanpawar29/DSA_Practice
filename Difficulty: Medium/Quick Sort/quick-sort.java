//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().quickSort(arr, 0, n - 1);
            printArray(arr);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low < high)
        {
            int partition = partition(arr,low,high);
            
            //left half
            quickSort(arr, low, partition-1);
            //right half
            quickSort(arr, partition+1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int pivot = arr[high]; // Pivot is the last element
        int i = low - 1;       // Initialize i as low - 1
    
        for (int j = low; j < high; j++) { // Iterate from low to high - 1
            if (arr[j] <= pivot) {     // If current element is less than or equal to pivot
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        
        //palce pivot element its correct place
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
       
       return i+1;
    }
}
