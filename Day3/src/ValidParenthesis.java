import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (s.isEmpty()) {
                    return false; // No opening bracket for the current closing bracket
                }
                char top = s.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return s.isEmpty(); // Return true if all brackets are matched
    }
   public static void main(String[] args) {
      String s = "()[]{}";
       System.out.println(isValid(s));
   }
}
