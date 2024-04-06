import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } 
            else if ((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && !stack.isEmpty()) {
                c = stack.pop();
                if (((int) s.charAt(i) - (int) c - 1) == 0 || ((int) s.charAt(i) - (int) c - 1) == 1) {
                } 
                else {
                    flag = false;
                }
            } 
            else {
                flag = false;
            }
        }
        if (stack.isEmpty() && flag == true) {
            return true;
        } 
        else {
            return false;
        }
    }
}