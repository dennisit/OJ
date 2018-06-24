package 滴滴_末尾0的个数;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(countFiveFactor(N));
    }

    private static int countFiveFactor(int N)
    {
        return N <= 1 ? 0 : N / 5 + countFiveFactor(N / 5);
    }
}
