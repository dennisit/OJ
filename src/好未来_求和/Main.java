package 好未来_求和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        List<List<Integer>> ret = new ArrayList<>();
        for (int size = 1; size <= N; size++) {
            List<Integer> nums = new ArrayList<>();
            dfs(size, 1, 0, nums, ret, N, M);
        }
        int len1 = ret.size();
        String[] strings = new String[len1];
        for (int i = 0; i < len1; i++) {
            strings[i] = "";
            int len2 = ret.get(i).size();
            for (int j = 0; j < len2; j++) {
                strings[i] += ret.get(i).get(j);
                if (j != len2 - 1) strings[i] += " ";
            }
        }
        Arrays.sort(strings);
        for (String s : strings) {
            System.out.println(s);
        }
    }

    private static void dfs(int size, int index, int sum, List<Integer> nums, List<List<Integer>> ret,
                            final int N, final int M)
    {
        if (nums.size() == size) {
            if (sum == M) {
                ret.add(new ArrayList<>(nums));
            }
            return;
        }
        for (int i = index; i <= N; i++) {
            nums.add(i);
            dfs(size, i + 1, sum + i, nums, ret, N, M);
            nums.remove(nums.size() - 1);
        }
    }
}
