import java.util.Arrays;

/**
 * Created by Rekhansh on 8/4/2017.
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 1) return nums;
        int n = nums.length;
        int[] prod = new int[n];
        Arrays.fill(prod, 1);

        //Fill left side
        int temp = 1;
        for (int i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= nums[i];
        }

        //Fill right side
        temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= nums[i];
        }
        return prod;
    }
}
