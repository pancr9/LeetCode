public class Solution {
    public boolean isValid(String s) {
        char ch[] = s.toCharArray();
        char test[] = new char[s.length()];
        int f = -1;
        if ("".equals(s)) return true;

        else if ((ch[0] == ']' || ch[0] == ')' || ch[0] == '}') || ((s.length() % 2 != 0)))
            return false;
        else {

            for (int i = 0; i < s.length(); i++) {

                if (ch[i] == '[' || ch[i] == '(' || ch[i] == '{') {
                    f++;
                    test[f] = ch[i];
                } else {
                    if (ch[i] == ']' && test[f] == '[')
                        f--;
                    else if (ch[i] == '}' && test[f] == '{')
                        f--;
                    else if (ch[i] == ')' && test[f] == '(')
                        f--;
                    else return false;
                }
            }
            return f == -1;
        }
    }
}
