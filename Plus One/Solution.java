public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == new int[]{0}) return new int[]{1};
        int carry = 1;
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9 && carry == 1) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] += carry;
                carry = 0;
            }
        }
        if (carry == 0) return digits;
        else {
            int[] result = new int[len + 1];
            result[0] = 1;
            for (int i = 1; i <= len; i++) result[i] = digits[i - 1];
            return result;
        }
    }
}
