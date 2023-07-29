// class Solution {
//     public int climbStairs(int n) {
//         if(n==0){
//             return 1;
//         }
//         if(n<0) return 0;
//         int ans1=climbStairs(n-1);
//         int ans2=climbStairs(n-2);
//         return ans1+ans2;
//     }
// }
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
        if(n>=2){
        dp[2]=2;
        }
        for(int i=3;i<=n;i++){
            int cs1=dp[i-1];
            int cs2=dp[i-2];
            dp[i] =cs1+cs2;
        }
        return dp[n];
        
    }
    
}