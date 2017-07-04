public class Solution {

    public int climbStairs(int n) {
        if (n < 4) return n;
        if (n == 4) return 5;
        return 3 * climbStairs(n - 3) + 2 * climbStairs(n - 4);
    }
}
