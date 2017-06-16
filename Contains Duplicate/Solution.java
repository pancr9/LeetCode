
public class Solution {
 public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> integers = new HashSet<>();
        for (int i : nums) if (!integers.add(i)) return true;
        return false;
    }

}
