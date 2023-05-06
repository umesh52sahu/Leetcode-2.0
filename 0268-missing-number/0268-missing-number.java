class Solution {
    public int missingNumber(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp=temp+nums[i];
        }
        int n=nums.length;
        return n*(n+1)/2-temp;
    }
}