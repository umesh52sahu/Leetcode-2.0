class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> pair=new HashMap<>();
        
                int[] ans=new int[2];
        for(int i = 0; i < nums.length; i++){
            pair.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            if(pair.containsKey(target-nums[i]) && i !=pair.get(target-nums[i])){
                ans[0]=i;
                ans[1]=pair.get(target-nums[i]);
                return ans;
                
            }
        }
        return ans;
    }
}