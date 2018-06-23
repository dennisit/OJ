package 小米_懂二进制;

public class Solution
{
    public int countBitDiff(int m, int n)
    {
        return Integer.bitCount(m ^ n);
    }
}