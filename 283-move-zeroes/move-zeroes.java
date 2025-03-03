class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int i=0;
        for(int j=0; j<n; j++)
        {
            if(arr[j] != 0)
            {
                arr[i] = arr[j];
                i++;
            }
        }

        for(int j=i; j<n; j++)
        {
            arr[j] = 0;
        }
    }
}