class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int len = s.length();
        int left = 0;
        int resultLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        Character c;
        // Sliding window with variable window size.
        for (int right = 0; right < len; right++) {
            c = s.charAt(right);
            map.put(c, right);
            if (map.size() > 2) {
                int newLeft = Collections.min(map.values());
                map.remove(s.charAt(newLeft));
                left = newLeft + 1;
            }
            resultLen = Math.max(resultLen, right - left + 1);
        }
        return resultLen;
    }
}