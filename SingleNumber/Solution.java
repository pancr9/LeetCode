public class SingleNumber {

    public int singleNumber(int[] nums) {
        int len = nums.length;
        int ans = 0;
        for(int i = 0; i<len;i++) ans ^= nums[i];
        
        return ans;

        /*HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i<nums.length;i++) {

            if (integers.add(nums[i]))
                integers.add(nums[i]);
            else integers.remove(nums[i]);
        }
        return integers.iterator().next();*/
    }
}
