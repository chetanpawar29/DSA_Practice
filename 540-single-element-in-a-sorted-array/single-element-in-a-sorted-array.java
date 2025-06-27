class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        // Optimal (XOR concept) t.c->o(n)
        // int xor = 0;
        // for(int i=0; i<n; i++){
        //     xor = xor^nums[i];
        // }
        // return xor;

        //Better T.C -> o(n) s.c->O(n/2)

        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i=0; i<n; i++){
        //     int value = map.getOrDefault(nums[i], 0);
        //     map.put(nums[i], value+1);
        // }

        // for(Map.Entry<Integer, Integer> it : map.entrySet()){
        //     if(it.getValue() == 1){
        //         return it.getKey();
        //     }
        // }

        // return -1;


        // Brute force T.C -> O(n^2)

        for(int i=0; i<n; i+=2){
            int num = nums[i];
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(nums[j] == num){
                    count++;
                    break;
                }
            }
            if(count == 1){
                return num;
            }
        }
        return -1;
    }
}