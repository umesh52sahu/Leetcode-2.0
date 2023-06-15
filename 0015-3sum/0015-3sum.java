class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length;k++){
            twoSum(nums,0-nums[k],k,ans);
            while(k+1<nums.length&&nums[k]==nums[k+1])k++;
        }
        return ans;
    }
    public void twoSum(int[] nums, int target,int k,List<List<Integer>> ans) {
        int i=k+1;
        int j=nums.length-1;
        while(i<j){
        List<Integer> subans=new ArrayList<>();
            if(nums[i]+nums[j]==target){
                subans.add(nums[i]);
                subans.add(nums[j]);
                subans.add(nums[k]);
            while(i<j&&nums[i]==nums[i+1])i++;
            while(i<j&&nums[j]==nums[j-1])j--;
                ans.add(subans);
                i++;
                j--;
            } else if(nums[i]+nums[j]>target){
                j--;
            } else{
                i++;
            }
        }
    }
}