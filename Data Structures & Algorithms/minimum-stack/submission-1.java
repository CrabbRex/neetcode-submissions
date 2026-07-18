class MinStack {
    List<Integer> stack;
    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        int min = stack.get(0);
        for(int s : stack) {
            if(s <= min) {
                min = s;
            }
        }
        return min;
    }
}
