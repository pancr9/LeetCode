
public class Solution {
    
 public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        else {
            if (s.equals(t)) return true;
            int a[] = new int[256];
            char sArray[] = s.toCharArray();
            char tArray[] = t.toCharArray();
            for (char c : sArray) a[c]++;
            for (char c : tArray) {
                if (a[c] == 0) return false;
                else a[c]--;
            }
            return true;
        }
    }
}
