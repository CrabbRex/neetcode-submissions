class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> tokenStack = new Stack<>();
        if(tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        int total = 0;
        
        for (int i=0; i<tokens.length; i++) {
            System.out.println(tokens[i]);
            if (tokens[i].equals("+")) {
                total = tokenStack.pop() + tokenStack.pop();
                tokenStack.push(total);
            }
            else if (tokens[i].equals("-")) {
                int first = tokenStack.pop();
                int second = tokenStack.pop();
                total = second - first;
                tokenStack.push(total);
            }
            else if (tokens[i].equals("/")) {
                int first = tokenStack.pop();
                int second = tokenStack.pop();
                total = second / first;
                tokenStack.push(total);
            }
            else if (tokens[i].equals("*")) {
                total = tokenStack.pop() * tokenStack.pop();
                tokenStack.push(total);
            }
            else {
                tokenStack.add(Integer.parseInt(tokens[i]));
            }
            System.out.println(tokenStack);
        }
        
        return total;
    }
}
