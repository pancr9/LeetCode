class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length < 2)
            return nums.length;

        int uniqueCount = 1;
        
        //Init first element as current unique element.
        int currentUniqueElement = nums[0];
        
        //Create a queue to store positions that needs to be replaced.
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= currentUniqueElement) {
                queue.add(i);
            } else {
                uniqueCount++;
                currentUniqueElement = nums[i];
                queue.add(i);
                try {

                    int j = queue.poll();
                    nums[j] = currentUniqueElement;
                } catch (Exception e) {
                    nums[uniqueCount - 1] = nums[i];
                }
            }
        }

        return uniqueCount;

    }
}
