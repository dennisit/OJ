package 腾讯_素数对;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        boolean[] primes = new boolean[N + 1];
        Arrays.fill(primes, true);
        primes[1] = primes[0] = false;
        for (int i = 2; i <= N; i++) {
            if (!primes[i]) continue;
            for (int j = i * i; j <= N; j += i) {
                primes[j] = false;
            }
        }
        int count = 0;
        for (int i = 1; i <= N / 2; i++) {
            if (primes[i] && primes[N - i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
