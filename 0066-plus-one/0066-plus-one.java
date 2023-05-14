class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            carry=carry+digits[i];
            digits[i]=carry%10;
            carry=carry/10;
        }
        if(carry>0){
            int[] ans=new int[digits.length+1];
            ans[0]=carry;
            for(int i=1;i<ans.length;i++){
                ans[i]=digits[i-1];
            }
            return ans;
        }
        return digits;
    }
}