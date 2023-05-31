class Solution {
    public boolean isPowerOfTwo(int n) {
     
        return check(n,true);
    }
    public static boolean check(int n, boolean istrue){
        if(n<=0) return false;
        if(n==1) return true;
        
        if(n%2==0){
             return check(n/2,istrue);
        } else{
            return false;
        }
    }
}