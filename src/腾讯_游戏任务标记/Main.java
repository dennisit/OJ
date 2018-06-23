package 腾讯_游戏任务标记;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] bitmap = new int[32];
        int x = in.nextInt() - 1, y = in.nextInt() - 1;
        if (x >= 1024 || x < 0 || y >= 1024 || y < 0) {
            System.out.println(-1);
            return;
        }
        set(bitmap, x);
        System.out.println(get(bitmap, y));
    }

    private static void set(int[] bitmap, int value)
    {
        bitmap[index(value)] |= shift(value);
    }

    private static int get(int[] bitmap, int value)
    {
        return (bitmap[index(value)] & shift(value)) == 0 ? 0 : 1;
    }

    private static int index(int value)
    {
        return value >> 5;          // value / 32
    }

    private static int shift(int value)
    {
        return 1 << (value & 0xf);  // value % 32
    }
}
