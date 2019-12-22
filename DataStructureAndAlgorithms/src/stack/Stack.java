package stack;

public class Stack {

	private int size;
	private int top;
	private int[] stackArray;
	
	//构造函数
	public Stack(int size){
		stackArray=new int[size];
		top=-1;
		this.size=size;
	}
	
	//入栈，栈顶元素下标+1
	public void push(int elem){
		if(this.isFull()){
			System.out.println("栈已满，无法入栈");
		}else{
			stackArray[++top]=elem;
		}
	}
	
	//出栈，删除栈顶元素，栈顶元素下标-1
	public int pop(){
		if(this.isEmpty()){
			System.out.println("空栈，无法出栈");
			return -1;
		}else return stackArray[top--];
	}
	
	//查看栈顶元素
	public int peek(){
		return stackArray[top];
	}
	
	//判断是否为空
	public boolean isEmpty(){
		return (top==-1);
	}
	
	//判断是否满
	public boolean isFull(){
		return (top==size-1);
	}
	
	public static void main(String[] args) {
		Stack s=new Stack(4);
		System.out.println(s.isEmpty());
		s.pop();
		s.push(4);
		System.out.println(s.peek());
		System.out.println(s.pop());
		s.push(4);
		s.push(4);
		s.push(4);
		s.push(4);
		System.out.println(s.isFull());
		s.push(3);
		
	}
	
	
	
}


