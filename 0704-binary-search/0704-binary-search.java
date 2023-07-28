class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int m=(s+e)/2;
        while(s<=e){
            m=(s+e)/2;
            if(target<nums[m]){
                e=m-1;
            } else if(target>nums[m]){
                s=m+1;
            } else{
                return m;
            }
        }
        return -1;
    }
}