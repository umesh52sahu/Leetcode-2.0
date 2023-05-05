class Solution {
    public int[] searchRange(int[] nums, int target) {
       int si=-1;
        int ei=-1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
               if(si==-1){
                    si=i;
                    ei=i;
               } else{
                   ei=i;
               }
           } 
       } 
        int[] ans=new int[2];
        ans[0]=si;
        ans[1]=ei;
        return ans;
    }
}