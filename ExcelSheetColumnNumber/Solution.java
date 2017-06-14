
public class Solution {
    public int titleToNumber(String s) {

        int count = 0;
        int len = s.length();
        for (Character c : s.toCharArray()) count+= ((int) c - 64) * Math.pow(26, len-- - 1);
        return count;
    }
}
