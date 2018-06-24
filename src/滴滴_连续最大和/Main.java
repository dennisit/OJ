package 滴滴_连续最大和;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }
        long maxSum = 0;
        long curSum = 0;
        for (int i = 0; i < N; i++) {
            curSum += nums[i];
            if (curSum < 0) curSum = 0;
            maxSum = Math.max(maxSum, curSum);
        }
        if (maxSum == 0) maxSum = Arrays.stream(nums).max().getAsInt();
        System.out.println(maxSum);
    }
}
