package validParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s == null)
            return false;
        // if (s.replace(" ", "").length() % 2 != 0)
        //     return false;

        Stack<Character> resStack = new Stack<>();
        // Set<Character> VALUES = new HashSet<Character>(Arrays.asList(
        //     new Character[] {'[', '(', '{'}
        // ));

        for (int i = s.length() - 1; i >= 0; i--) {
            char cur = s.charAt(i);

            if (cur == '[' || cur == '{' || cur == '(') {
                if (resStack.isEmpty())
                    return false;

                char prev = resStack.pop();
                if (cur == '(' && prev != ')' || cur == '[' && prev != ']' || cur == '{' && prev != '}')
                    return false;
            } else {
                resStack.push(cur);
            }
        }

        return resStack.isEmpty();
    }
}
