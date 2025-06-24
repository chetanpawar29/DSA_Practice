class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[2];
        Arrays.fill(arr,-1);

        for(int i=0; i<n; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        if(!list.isEmpty()){
            arr[0] = list.get(0);
            arr[1] = list.get(list.size()-1);
        }
        

        return arr;
    }
}