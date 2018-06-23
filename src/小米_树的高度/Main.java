package 小米_树的高度;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] size = new int[N];
        int[] height = new int[N];

        height[0] = 1;
        for (int i = 0; i < N - 1; i++) {
            int p = in.nextInt(), c = in.nextInt();
            size[p]++;
            if (size[p] <= 2) {  /* 因为题目要求的是二叉树，因此多余的孩子节点直接剔除 */
                height[c] = height[p] + 1;
            }
        }
        System.out.println(Arrays.stream(height).max().getAsInt());
    }
}
