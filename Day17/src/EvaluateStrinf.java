import java.util.*;
public class EvaluateStrinf {

        public static int calculate(String s) {
            Stack<Integer> stack = new Stack<>();
            int currNum = 0;
            char currOp = '+';
            int result = 0;

            for (int i = 0; i < s.length(); i++) {
                char currChar = s.charAt(i);

                if (Character.isDigit(currChar)) {
                    currNum = currNum * 10 + (currChar - '0');
                }

                if (!Character.isDigit(currChar) && currChar != ' ' || i == s.length() - 1) {
                    if (currOp == '+') {
                        stack.push(currNum);
                    } else if (currOp == '-') {
                        stack.push(-currNum);
                    } else if (currOp == '*') {
                        stack.push(stack.pop() * currNum);
                    } else if (currOp == '/') {
                        stack.push(stack.pop() / currNum);
                    }
                    currOp = currChar;
                    currNum = 0;
                }
            }
            while (!stack.isEmpty()) {
                result += stack.pop();
            }
            return result;
        }

    public static void main(String args[]){
        String s="5+7*8-2/9";
        //3+2*2
        System.out.println(calculate(s));
    }
}
