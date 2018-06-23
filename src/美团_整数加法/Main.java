package 美团_整数加法;

import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s1 = in.next();
            String s2 = in.next();
            try {
                BigInteger x1 = new BigInteger(s1);
                BigInteger x2 = new BigInteger(s2);
                System.out.println(x1.add(x2));
            } catch (NumberFormatException e) {
                System.out.println("error");
            }
        }
    }
}
