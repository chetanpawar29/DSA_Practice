class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new LinkedList<>();

       for(int i=1; i<=numRows; i++){
            List<Integer> temp = new LinkedList<>();
            int res = 1;
            temp.add(res);
            for(int j=1; j<i; j++){
                res = res * (i - j);
                res = res / (j);
                temp.add(res);
            }
            ans.add(temp);
       } 
       return ans;
    }
}