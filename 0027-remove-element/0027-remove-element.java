class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        int len=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            } else{
                len--;
                nums[i]=0;
            }
        }
        return len;
    }
}