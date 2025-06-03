class Solution {
    // This solution uses Floyd's Tortoise and Hare (Cycle Detection) algorithm
    public int findDuplicate(int[] nums) {
        // Phase 1 - Find the intersection point (for fast and slow pointer)
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2 - Find entrance for the cycle - do one step by one to find the cycle entry point
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}