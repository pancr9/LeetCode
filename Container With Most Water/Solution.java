class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = Integer.MIN_VALUE;
        while (left <= right) {
            int temp = (right - left) * Math.min(height[left], height[right]);
            area = Math.max(area, temp);
            if(height[left] > height[right]){
                right--;
            } else left++;
        }
        return area;
    }
}