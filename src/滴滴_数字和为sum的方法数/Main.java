package 滴滴_数字和为sum的方法数;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), S = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        long[][] dp = new long[N + 1][S + 1];
        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= N; i++) {
            int value = nums[i - 1];
            for (int j = 0; j <= S; j++) {
                if (j >= value) dp[i][j] = dp[i - 1][j - value] + dp[i - 1][j];
                else dp[i][j] = dp[i - 1][j];
            }
        }
        System.out.println(dp[N][S]);
    }
}
