/**
 * Created by Rekhansh on 8/3/2017.
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();
        for (char c : s.toUpperCase().toCharArray())
            if (c > 64 && c < 91)
                temp.append(c);
        if (temp.length() < 2) return true;
        int len = temp.length();
        for (int i = 0; i <= len / 2; i++)
            if (temp.charAt(i) != temp.charAt(len - i - 1))
                return false;
        return true;
    }
}
