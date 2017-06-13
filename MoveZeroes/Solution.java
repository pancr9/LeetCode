public class Solution {
    public void moveZeroes(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
                                                //Replace only if integer is non-zero.
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count++] = temp;           //Post increments count if non-zero element found.
            }
        }
    }
}
