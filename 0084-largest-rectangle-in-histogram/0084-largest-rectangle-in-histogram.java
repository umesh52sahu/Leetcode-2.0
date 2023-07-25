class Solution {
    public int largestRectangleArea(int[] nums) {
        int n = nums.length;
        int[] r = new int[n];
        int[] l = new int[n];
        int max = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!st.empty() && nums[i] <= nums[st.peek()]) st.pop();
            r[i] = (st.empty())? n:st.peek();
            st.push(i);
        }
        st = new Stack<>();
        for(int i = 0; i<n; i++){
            while(!st.empty() && nums[i] <= nums[st.peek()]) st.pop();
            l[i] = (st.empty())? 0:st.peek()+1;
            st.push(i);
        }
        int count = 0;
        for(int j=0;j<n;j++){
            count = (r[j] - l[j])*nums[j];
            max = Math.max(max,count);
        }
        return max;
    }
}