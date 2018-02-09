package easy;

import java.util.Stack;

/**
 * Created by yrd on 2018/2/9.
 */
public class Problem20 {

    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            switch (c) {
                case '(' : {
                    stack.push(c);
                    break;
                }
                case '[' : {
                    stack.push(c);
                    break;
                }
                case '{' : {
                    stack.push(c);
                    break;
                }
                case ')' : {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char c1 = stack.peek();
                    if (c1 == '(') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                }
                case ']' : {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char c1 = stack.peek();
                    if (c1 == '[') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                }
                case '}' : {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char c1 = stack.peek();
                    if (c1 == '{') {
                        stack.pop();
                        break;
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
