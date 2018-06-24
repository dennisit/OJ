package 好未来_最小的k个数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        while (in.hasNextInt()) {
            input.add(in.nextInt());
        }
        int[] nums = new int[input.size() - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.get(i);
        }
        int k = input.get(input.size() - 1);
        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i != k - 1) System.out.print(" ");
        }
    }
}
