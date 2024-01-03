import java.util.Stack;

class ValidParenthisis {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> s1 = new Stack<Character>();
        for (char i : s.toCharArray()) {
            if (i == '(') {
                s1.push(')');
            } else if (i == '{') {
                s1.push('}');
            } else if (i == '[') {
                s1.push(']');
            } else if (s1.isEmpty() || s1.pop() != i) {
                return false;
            }
        }
        return s1.isEmpty();
    }
}