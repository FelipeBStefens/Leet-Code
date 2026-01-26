package Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            
            switch (s.charAt(i)) {
                case ')' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char character = stack.pop();
                    if (character != '(') {
                        return false;
                    }                          
                }
                case '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char character = stack.pop();
                    if (character != '{') {
                        return false;
                    }                          
                }
                case ']' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char character = stack.pop();
                    if (character != '[') {
                        return false;
                    }                          
                }
                default -> stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}