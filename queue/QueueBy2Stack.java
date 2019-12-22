package queue;

import java.util.Stack;

public class QueueBy2Stack {
	    Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        while(!stack2.isEmpty()){
	            stack1.push(stack2.pop());
	        }
	    	stack1.push(node);
	    }
	    
	    public int pop() {
	       
	    	while(!stack1.isEmpty()){
	            stack2.push(stack1.pop());
	        }
	    	return stack2.pop();
	    }
	    
	    public static void main(String[] args) {
			QueueBy2Stack ds=new QueueBy2Stack();
			ds.push(6);
			ds.push(4);
			ds.push(53);
			System.out.println(ds.pop());
			System.out.println(ds.pop());
			System.out.println(ds.pop());
		}
	    
}

