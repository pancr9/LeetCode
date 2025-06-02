class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int k = 0;
        int n = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int expectedTwoSum = k - nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int actualTwoSum = nums[left] + nums[right];
                if (actualTwoSum == expectedTwoSum) {
                    // Found the triplet.
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (actualTwoSum > expectedTwoSum) {
                    right--;
                } else
                    left++;
            }
        }
        return new ArrayList<>(res);
    }
}