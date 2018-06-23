package 猪八戒_数串;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int N = in.nextInt();
            String[] nums = new String[N];
            for (int i = 0; i < N; i++) {
                nums[i] = in.next();
            }
            Arrays.sort(nums, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
            Arrays.stream(nums).forEach(System.out::print);
        }
    }
}
