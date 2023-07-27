class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Qu=new PriorityQueue(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            Qu.add(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            Qu.remove();
        }
        return Qu.peek();
    }
}