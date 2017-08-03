/**
 * Created by Rekhansh on 8/3/2017.
 * Based on the algorithm "Sieve of Erathosthenes"
 */
public class Solution {

    public int countPrimes(int n) {
        if (n < 3) return 0;
        boolean prime[] = new boolean[n];
        for (int p = 2; p * p < n; p++)
            if (!prime[p])
                for (int i = p * 2; i < n; i += p)
                    prime[i] = true;
        
        int count = n;
        for (boolean b : prime)
            if (b) count--;
        
        return (count - 2);
    }
}
