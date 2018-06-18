package 小米_中国牛市;

public class Solution {
    public int calculateMax(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[3][n];     // 大小为 2 的背包
        for (int i = 1; i <= 2; i++) {
            int localMax = -prices[0];  // 第一个价格只能作为买入价格
            for (int j = 1; j < n; j++) {
                // 试着将当前价格作为卖出价格，比较这次交易的收益是否比前面的交易来得高
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + localMax);
                localMax = Math.max(localMax, dp[i - 1][j] - prices[j]);
            }
        }
        return dp[2][n - 1];
    }
}