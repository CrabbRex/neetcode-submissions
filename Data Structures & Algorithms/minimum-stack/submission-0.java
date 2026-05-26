class MinStack {
    List<Object> stack;
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
        return (int) stack.get(stack.size()-1);

    }
    
    public int getMin() {
        int min = (int) stack.get(0);
        for(int i=0; i<stack.size(); i++) {
            min = Math.min(min, (int) stack.get(i));
        }
        return min;
    }
}
