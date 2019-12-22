package stack;

public class Stack {

	private int size;
	private int top;
	private int[] stackArray;
	
	//���캯��
	public Stack(int size){
		stackArray=new int[size];
		top=-1;
		this.size=size;
	}
	
	//��ջ��ջ��Ԫ���±�+1
	public void push(int elem){
		if(this.isFull()){
			System.out.println("ջ�������޷���ջ");
		}else{
			stackArray[++top]=elem;
		}
	}
	
	//��ջ��ɾ��ջ��Ԫ�أ�ջ��Ԫ���±�-1
	public int pop(){
		if(this.isEmpty()){
			System.out.println("��ջ���޷���ջ");
			return -1;
		}else return stackArray[top--];
	}
	
	//�鿴ջ��Ԫ��
	public int peek(){
		return stackArray[top];
	}
	
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty(){
		return (top==-1);
	}
	
	//�ж��Ƿ���
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


