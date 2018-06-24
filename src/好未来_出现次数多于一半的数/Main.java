package 好未来_出现次数多于一半的数;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Integer num = null;
        int cnt = 0;
        while (in.hasNextInt()) {
            int x = in.nextInt();
            if (cnt == 0) num = x;
            if (num == x) cnt++;
            else cnt--;
        }
        System.out.println(num);
    }
}
