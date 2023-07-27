class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Qu=new PriorityQueue();
        for(int i=0;i<nums.length;i++){
            Qu.add(nums[i]);
            if(Qu.size()>k){
                Qu.remove();
            }
        }
    
        return Qu.peek();
    }
}