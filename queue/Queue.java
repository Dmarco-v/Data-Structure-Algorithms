package queue;

public class Queue {

	private int [] queArray;
	private int maxSize;
	private int front;
	private int rear;
	private int length;
	
	public Queue (int maxSize){
		this.maxSize=maxSize;
		queArray=new int [maxSize];
		front=0;
		rear=-1;
		length=0;
	} 
	
	//����
	public boolean isFull(){
		if(length==maxSize){
			return true;
		}else return false;
	}
	
	//�п�
	public boolean isEmpty(){
		if(length==0){
			return true;
		}else return false;
	}
	
	//�������
	public void insert(int elem) throws Exception{
		if(this.isFull()){
			throw new Exception("�������������ܽ��в��������");
		}
		//�����βָ���ѵ������ĩ�ˣ����뵽����ĵ�һ��λ��
		if(rear==maxSize-1){
			rear=-1;
		}
		queArray[++rear]=elem;
		length++;
	}
	
	//�Ƴ�����
	public int remove() throws Exception{
		if(this.isEmpty()){
			throw new Exception("����Ϊ�գ����ܽ����Ƴ�������");
		}
		int elem= queArray[front++];
		//�����ͷָ���ѵ������ĩ�ˣ����ѵ�����ĵ�һ��λ��
		if(front==maxSize){
			front =0;
		}
		length--;
		return elem;
	}
	
	//�鿴��ͷԪ��
	public int peek() throws Exception{
		if(this.isEmpty()){
			throw new Exception("������û��Ԫ�أ�");
		}
		return queArray[front];
	}
	
	public static void main(String[] args) throws Exception {
		Queue que=new Queue(10);
		que.insert(9);
		que.insert(17);
		System.out.println(que.peek());
		que.remove();
		System.out.println(que.peek());
	}
	
}
