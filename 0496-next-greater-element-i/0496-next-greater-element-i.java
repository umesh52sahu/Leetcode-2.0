class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = nums2.length-1; i >= 0; i--){
            
            while(!st.empty() && nums2[i] >= st.peek()){
                    st.pop();
            }
            int idx = (st.empty()) ? -1 : st.peek();
            hm.put(nums2[i] , idx);
            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        int i=0;
        for(int max : nums1){
            ans[i]=hm.get(max);
            i++;
        }
        return ans;
    }
}