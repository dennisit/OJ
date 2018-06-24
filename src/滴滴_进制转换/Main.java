package 滴滴_进制转换;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int M = in.nextInt(), N = in.nextInt();
            System.out.println(Integer.toString(M, N).toUpperCase());
        }
    }
}
