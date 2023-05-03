class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subans=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            boolean check=false;
            
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    check=true;
                    break;
                }
            }    
            if(check==false&&!subans.contains(nums1[i]))
            subans.add(nums1[i]);
        }
        ans.add(subans);
        
        subans=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            boolean check=false;
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    check=true;
                    break;
                }
            } 
            if(check==false&&!subans.contains(nums2[i]))
            subans.add(nums2[i]);
        }
        ans.add(subans);
        return ans;
    }
}