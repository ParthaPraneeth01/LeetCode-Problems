class MinStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
        else{
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
 public class leetCode155_MinStack {
    public static void main(String[] args) {
        // Example Input
        String[] operations = {"MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"};
        int[][] values =      {{},       {-2},   {0},    {-3},     {},      {},   {},     {}};

        MinStack obj = null;

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MinStack":
                    obj = new MinStack();
                    System.out.println("null");
                    break;
                case "push":
                    obj.push(values[i][0]);
                    System.out.println("null");
                    break;
                case "pop":
                    obj.pop();
                    System.out.println("null");
                    break;
                case "top":
                    System.out.println(obj.top());
                    break;
                case "getMin":
                    System.out.println(obj.getMin());
                    break;
            }
        }
    }
}