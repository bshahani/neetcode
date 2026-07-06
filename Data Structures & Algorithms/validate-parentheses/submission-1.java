class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        
        for (char c: s.toCharArray()) {
            switch(c) {
                case '{' -> stack.push('{');
                case '(' -> stack.push('(');
                case '[' -> stack.push('[');
                case '}' -> {
                    if (!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    else stack.push('}');
                }
                case ']' -> {
                    if (!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else stack.push(']');
                }
                case ')' -> {
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else stack.push(')');
                }

            }
        }

        return stack.size() > 0 ? false : true;
    }
}
