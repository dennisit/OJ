package 腾讯_geohash编码;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder encode = new StringBuilder();
        int Precision = 6;
        int l = -90, h = 90;
        while (Precision-- > 0) {
            int m = (l + h) / 2;
//            int m = l + (h - l) / 2;
            if (N < m) {
                h = m;
                encode.append("0");
            } else {
                l = m;
                encode.append("1");

            }
        }
        System.out.println(encode);
    }
}
