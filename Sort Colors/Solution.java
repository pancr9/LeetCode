class Solution {
    public void sortColors(int[] nums) {

        int[] rgb = new int[3];
        for (Integer i : nums)
            switch (i) {
                case 0:
                    rgb[0]++;
                    break;
                case 1:
                    rgb[1]++;
                    break;
                default:
                    rgb[2]++;
            }

        //Set rgb values.    
        int i = 0;
        for (int j = 0; j < 3; j++)
            while (rgb[j]-- > 0)
                nums[i++] = j;


    }
}
