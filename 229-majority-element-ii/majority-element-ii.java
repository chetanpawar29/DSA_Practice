class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list  = new LinkedList<>();
        int n = nums.length;
        int ele1 = 0, ele2 = 0;
        int ctr1 = 0, ctr2 = 0;

        for(int i=0; i<n; i++){
            if(ctr1 == 0 && nums[i] != ele2){
                ctr1 = 1;
                ele1 = nums[i];
            }else if(ctr2 == 0 && nums[i] != ele1){
                ctr2 = 1;
                ele2 = nums[i];
            }else if(ele1 == nums[i]){
                ctr1++;
            }else if(ele2 == nums[i]){
                ctr2++;
            }else{
                ctr1--;
                ctr2--;
            }
        }
        
        ctr1=0; ctr2=0;
        for(int i=0; i<n; i++){
            if(ele1 == nums[i]){
                ctr1++;
            }else if(ele2 ==nums[i]){
                ctr2++;
            }
        }
        

         if(ctr1 > n/3){
            list.add(ele1);
        }
        if(ctr2 > n/3){
            list.add(ele2);
        }
        return list;

    }
}