// https://leetcode.com/problems/coin-change/

// Bottom up
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount == 0)
            return 0;
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Integer.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }

        if (dp[amount] != Integer.MAX_VALUE)
            return dp[amount];

        return -1;
    }
}

// Top down