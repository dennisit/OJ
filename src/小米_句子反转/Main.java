package 小米_句子反转;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String sentence = in.nextLine();
            char[] chars = sentence.toCharArray();
            int n = chars.length;
            int i = 0;
            while (true) {
                int j = i + 1;
                while (j < n && chars[j] != ' ') j++;
                reverse(chars, i, j - 1);
                if (j == n) break;
                i = j + 1;
            }
            reverse(chars, 0, n - 1);
            System.out.println(new String(chars));
        }
    }

    private static void reverse(char[] chars, int i, int j)
    {
        while (i < j) {
            char t = chars[i];
            chars[i] = chars[j];
            chars[j] = t;
            i++;
            j--;
        }
    }
}
