package 网易_合唱团;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            int[] nums = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                nums[i] = in.nextInt();
            }
            int K = in.nextInt();
            int D = in.nextInt();
            // 要考虑正负号，所以需要记录最大值和最小值
            long[][] max = new long[K + 1][N + 1];
            long[][] min = new long[K + 1][N + 1];
            long ret = Long.MIN_VALUE;
            for (int i = 1; i <= N; i++) {
                max[1][i] = min[1][i] = nums[i];
                for (int k = 2; k <= K; k++) {
                    for (int j = i - 1; j > 0 && i - j <= D; j--) {
                        long value1 = max[k - 1][j] * nums[i];
                        long value2 = min[k - 1][j] * nums[i];
                        max[k][i] = Math.max(max[k][i], Math.max(value1, value2));
                        min[k][i] = Math.min(min[k][i], Math.min(value1, value2));
                    }
                }
                ret = Math.max(ret, max[K][i]);
            }
            System.out.println(ret);
        }
    }
}