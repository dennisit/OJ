package 美团_丢失的三个数;

import java.util.BitSet;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BitSet bitSet = new BitSet();
        for (int i = 0; i < 9997; i++) {
            bitSet.set(in.nextInt());
        }
        StringBuilder num = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!bitSet.get(i)) {
                num.append(i);
            }
        }
        System.out.println(Long.valueOf(num.toString()) % 7);
    }
}
