  public class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            int i = nums1.length;
            int j = nums2.length;
            if (j < 1 || i < 1 || nums2 == null || nums1 == null) return new int[0];
            int size = i > j ? j : i;
            int[] list = new int[size];
            size = 0;
            i = 0;
            j = 0;
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    list[size++] = nums1[i++];
                    j++;
                } else if (nums1[i] < nums2[j]) i++;
                else j++;
            }
            return Arrays.copyOfRange(list, 0, size);
        }
    }
