// Longest Substring Without Repeating Characters

class Solution {
    // Using sliding window technique with variable window size.
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len < 2) {
            return len;
        }
        int longestSubString = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        Character c;
        for (int right = 0; right < len; right++) {
            c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left++));
            }
            set.add(c);
            longestSubString = Math.max(longestSubString, right - left + 1);
        }
        return longestSubString;
    }
}