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
        int[] missing = new int[3];
        int index = 0;
        for (int i = 1; i <= 10000; i++) {
            if (!bitSet.get(i)) {
                missing[index++] = i;
            }
        }
        long num = Long.valueOf(missing[0] + "" + missing[1] + "" + missing[2]);
        System.out.println(num % 7);
    }
}
