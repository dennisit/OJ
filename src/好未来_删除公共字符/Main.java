package 好未来_删除公共字符;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine(), y = in.nextLine();
        Set<Character> set = new HashSet<>();
        for (char c : y.toCharArray()) {
            set.add(c);
        }
        for (char c : x.toCharArray()) {
            if (!set.contains(c)) {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
