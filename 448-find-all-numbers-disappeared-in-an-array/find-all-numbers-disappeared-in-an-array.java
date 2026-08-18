class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int arr[] = new int[n+1];

        for(int i=0; i<n; i++){
            arr[nums[i]]++;
        }

        for(int i=1; i<n+1; i++){
            if(arr[i] == 0){
                list.add(i);
            }
        }

        return list;
    }
}