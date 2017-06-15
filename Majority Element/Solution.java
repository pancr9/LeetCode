
public class Solution {
    public int majorityElement(int[] nums) {
        int size = nums.length;
        switch (size) {
            case 0:
                return 0;
            case 1:
                return nums[0];
        }
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < size; i++) {
            if (nums[i] != major) count--;
            else count++;
            if (count == 0) {
                count++;
                major = nums[i];
            }
        }

        return major;
    }

}
