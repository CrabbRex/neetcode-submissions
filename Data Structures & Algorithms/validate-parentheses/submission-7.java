class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracket = new Stack<Character>();
        if(s.length() <= 1) {
            return false;
        }
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                bracket.push(s.charAt(i));
            }
            if(bracket.isEmpty()) {
                return false;
            }
            if (c == ')') {
                char toCheck = bracket.pop();
                if (toCheck != '(') {
                    return false;
                }
            }
            else if(c == ']') {
                char toCheck = bracket.pop();
                if (toCheck != '[') {
                    return false;
                }
            }
            else if(c == '}') {
                char toCheck = bracket.pop();
                if (toCheck != '{') {
                    return false;
                }
            }
        }
        return bracket.isEmpty();
    }
}
