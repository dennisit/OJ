package 好未来_字符串中找出连续最长的数字串;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String max = "";
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && isNumber(s.charAt(j))) j++;
            String sub = s.substring(i, j);
            if (sub.length() > max.length()) max = sub;
            i = j + 1;
        }
        System.out.println(max);
    }

    private static boolean isNumber(char c)
    {
        return c >= '0' && c <= '9';
    }
}
