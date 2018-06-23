package 美团_拼凑面额;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] moneys = {1, 5, 10, 20, 50, 100};
        long[] amounts = new long[N + 1];
        Arrays.fill(amounts, 1);
        for (int i = 1; i < moneys.length; i++) {
            for (int j = 1; j <= N; j++) {
                if (j >= moneys[i]) {
                    amounts[j] += amounts[j - moneys[i]];
                }
            }
        }
//        for (int i = 1; i <= N; i++) {
//            for (int j = 0; j < moneys.length && moneys[j] <= i; j++) {
//                amounts[i] += amounts[i - moneys[j]];
//            }
//        }
        System.out.println(amounts[N]);
    }
}
