package 美团_网格走法数目;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int X = in.nextInt() + 1;  /* 不是在网格内部，而是在网格交叉点 */
            int Y = in.nextInt() + 1;
            int[] dp = new int[Y];
            Arrays.fill(dp, 1);
            for (int i = 1; i < X; i++) {
                for (int j = 1; j < Y; j++) {
                    dp[j] = dp[j] + dp[j - 1];
                }
            }
            System.out.println(dp[Y - 1]);
        }
    }
}
