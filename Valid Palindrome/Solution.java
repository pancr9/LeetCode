class Solution {
    public boolean isPalindrome(String s) {
        boolean isPalin = true;
        if (s.length() < 2) {
            return true;
        }
        // Remove all non-alphanumeric.         
        // Convert all to lower case
        s = s.toLowerCase();
        s = s.replaceAll("[^0-9a-z]", "");
        int len = s.length();
        int counterLim = (int) Math.ceil(len / 2);
        for (int i = 0; i < counterLim; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                isPalin = false;
                break;
            }
        }
        return isPalin;
    }
}