public class Solution {
    private int squares[] = new int[]{0, 1, 4, 9, 16, 25, 36, 49, 64, 81};

    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        while (!hashSet.contains(n)) {
            hashSet.add(n);
            n = getSum(n);
            if (n == 1) return true;
        }
        return false;
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += squares[n % 10];
            n /= 10;
        }
        return sum;
    }
}
