class Solution {
    public int findMaxK(int[] nums) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        
        HashSet<Integer> check=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            check.add(nums[i]);
        } 
        
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
        int i=nums.length-1;
        while(i>=0&&nums[i]>0){
            if(check.contains(-nums[i])){
                return nums[i];
            }
            i--;
        }
         
        return -1;
    }
}