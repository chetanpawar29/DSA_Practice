class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            Set<Integer> hashSet = new HashSet<>();
            for(int j=i+1; j<n; j++){
                int sum = -(nums[i]+nums[j]);
                if(hashSet.contains(sum)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j],sum);
                    temp.sort(null);
                    set.add(temp);
                }
                hashSet.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}