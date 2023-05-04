class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            boolean check=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    check=true;
                    break;
                }
            }
            if(check!=true){
                return i;
            }
        }
        return -1;
    }
}