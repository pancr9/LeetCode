
class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if (nums.length <= 1) return nums.length;
        int[] arr = new int[nums.length];
        Arrays.fill(arr,1);
        int res = Integer.MIN_VALUE;
        for(int i = 1; i< nums.length; i++){
            for(int j = 0;j < i; j++) {
                if(nums[j] < nums[i] && arr[i] <= arr[j]+1) {
                    arr[i] = arr[j]+1;
                }
            }
        }
        
        for(int i = 0; i< nums.length; i++){
            res = Math.max(res, arr[i]);
        }
        return res;
    }
}
