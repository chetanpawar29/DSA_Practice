class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int arr[] = new int[n];

        int i=0, j=0;
        int index = 0;
        while(i<n1 && j<n2){
            if(nums1[i] <= nums2[j]){
                arr[index++] = nums1[i];
                i++;
            }else{
                 arr[index++] = nums2[j];
                 j++;
            }
        }

        while(i<n1){
            arr[index++] = nums1[i];
            i++;
        }

        while(j<n2){
            arr[index++] = nums2[j];
            j++;
        }

        double medium;

        if(n%2==0){
            medium =(double) (arr[(n/2)-1]+arr[n/2])/2;
        }else{
            medium = arr[n/2];
        }
        return medium;
    }
}