class MinStack {
   int min,pop;
    Deque<Integer> stack =new ArrayDeque<>();
    Deque<Integer> minStack = new ArrayDeque<>();
    public MinStack() {

    }
    public void push(int val) {
      if(minStack.isEmpty())
      minStack.push(val);
      else if (val<=minStack.peek()) 
      minStack.push(val); 
      stack.push(val);
        
    }
    
    public void pop() {
        pop=stack.pop();
        min=minStack.peek();

        if(pop==min)
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();

        
    }
}
