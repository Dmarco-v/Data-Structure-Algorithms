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
	
	//判满
	public boolean isFull(){
		if(length==maxSize){
			return true;
		}else return false;
	}
	
	//判空
	public boolean isEmpty(){
		if(length==0){
			return true;
		}else return false;
	}
	
	//进入队列
	public void insert(int elem) throws Exception{
		if(this.isFull()){
			throw new Exception("队列已满，不能进行插入操作！");
		}
		//如果队尾指针已到数组的末端，插入到数组的第一个位置
		if(rear==maxSize-1){
			rear=-1;
		}
		queArray[++rear]=elem;
		length++;
	}
	
	//移出队列
	public int remove() throws Exception{
		if(this.isEmpty()){
			throw new Exception("队列为空，不能进行移除操作！");
		}
		int elem= queArray[front++];
		//如果队头指针已到数组的末端，则已到数组的第一个位置
		if(front==maxSize){
			front =0;
		}
		length--;
		return elem;
	}
	
	//查看队头元素
	public int peek() throws Exception{
		if(this.isEmpty()){
			throw new Exception("队列内没有元素！");
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
