class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        if(s.length() % 2 != 0) {
            return false;
        } else if ((s.charAt(0) != '(') && (s.charAt(0) != '[') && s.charAt(0) != '{') {
            return false;
        }
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if((c == '(') || (c == '[') || c == '{') {
                brackets.push(c);
            }
            if((c == ')')) {
                if(!brackets.isEmpty()) {
                    char cPop = brackets.pop();
                    if (cPop != '(') {
                        return false;
                    }
                }
            }
            else if((c == ']')) {
                if(!brackets.isEmpty()) {
                    char cPop = brackets.pop();
                    if (cPop != '[') {
                        return false;
                    }
                }
            }
            else if (c == '}') {
                if(!brackets.isEmpty()) {
                    char cPop = brackets.pop();
                    if (cPop != '{') {
                        return false;
                    }
                }
            }
        }
        return brackets.isEmpty();
    }
}
