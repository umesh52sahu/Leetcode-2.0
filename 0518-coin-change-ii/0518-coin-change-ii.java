class Solution {
    public int change(int amount, int[] coins) {
        Integer[][] dp = new Integer[amount+1][coins.length];
        return coinch(amount , 0, coins ,dp);
    }
    public int coinch(int amount,int idx, int[] coins, Integer[][] dp){
        if(amount==0){
            return 1;
        }
        if(amount<0 || idx == coins.length){
            return 0;
        }
        if(dp[amount][idx]!=null){
            return dp[amount][idx];
        }
        int a1=coinch(amount-coins[idx],idx,coins,dp);
        int a2=coinch(amount,idx+1,coins,dp);
        dp[amount][idx] = a1+a2;
        return a1+a2;
    }
}

// class Solution {
//     public int change(int amount, int[] coins) {
//         return coinch(amount,0,coins);
//     }
//     public int coinch(int amount, int idx, int[] coins){
//         if(amount==0){
//             return 1;
//         }
//         if(amount<0 || idx==coins.length){
//             return 0;
//         }
//         int a1=coinch(amount-coins[idx],idx,coins);
//         int a2=coinch(amount,idx+1,coins);
//         return a1+a2;
//     }
// }
