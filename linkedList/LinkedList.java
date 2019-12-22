package linkedList;

public class LinkedList {

	class Element {
		public Object value = null;
		private Element next = null; // 存放指针
	}

	private Element header = null; // 存放头结点

	public LinkedList() {
		header = new Element();
		header.value = null;
		header.next = null;
	}

	// 插入,插入到链表的尾端
	void insertList(Object o) {
		Element e = new Element();
		e.value = o;
		// 第一次插入元素
		if (header.next == null) {
			header.next = e;
		} else {
			Element temp = header;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = e;
		}
	}
	
	//删除链表中值为o的元素
	void deleteList(Object o){
		Element temp=header;
		while(temp.next!=null){
			if(temp.next.value.equals(o)){
				temp.next=temp.next.next;
			}
			else{
				temp=temp.next;
			}
		}
	}
	
	//链表长度
	int size(){
		Element temp=header;
		int size=0;
		while(temp.next!=null){
			size++;
			temp=temp.next;
		}
		return size;
	}
	
	//判断链表中是否存在某元素
	Boolean contains(Object o){
		Element temp=header;
		while(temp.next!=null){
			if(temp.next.value.equals(o)){
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	//打印链表
	void print(){
		System.out.println("打印链表");
		Element temp=header;
		while(temp.next!=null){
			temp=temp.next;
			System.out.print(temp.value+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		list.insertList("hello");
		list.insertList(2);
		list.print();
		System.out.println(list.size());
		if(list.contains(2)){
			list.deleteList(2);
			System.out.println("删除成功");
		}else System.out.println("删除失败，该元素不在链表中");
		System.out.println(list.header.value);
	}
	
}
