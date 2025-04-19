class Solution {
    public int[] asteroidCollision(int[] a) {
        int n = a.length;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            if(a[i] > 0) 
            {
                stack.push(a[i]);
            }else{
                while(!stack.empty() && stack.peek() > 0 && stack.peek() < Math.abs(a[i])){
                    stack.pop();
                }

                if(!stack.empty() && stack.peek() == Math.abs(a[i])){
                    stack.pop();
                }else if(stack.empty() || stack.peek() < 0){
                    stack.push(a[i]);
                }
            }
        }

        int ans[] = new int[stack.size()];

        for(int i = ans.length-1; i>=0; i--){
            ans[i] = stack.pop();
            
        }

        return ans;
    }
}