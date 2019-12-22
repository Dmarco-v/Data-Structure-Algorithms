package linkedList;

public class LinkedList {

	class Element {
		public Object value = null;
		private Element next = null; // ���ָ��
	}

	private Element header = null; // ���ͷ���

	public LinkedList() {
		header = new Element();
		header.value = null;
		header.next = null;
	}

	// ����,���뵽�����β��
	void insertList(Object o) {
		Element e = new Element();
		e.value = o;
		// ��һ�β���Ԫ��
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
	
	//ɾ��������ֵΪo��Ԫ��
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
	
	//������
	int size(){
		Element temp=header;
		int size=0;
		while(temp.next!=null){
			size++;
			temp=temp.next;
		}
		return size;
	}
	
	//�ж��������Ƿ����ĳԪ��
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
	
	//��ӡ����
	void print(){
		System.out.println("��ӡ����");
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
			System.out.println("ɾ���ɹ�");
		}else System.out.println("ɾ��ʧ�ܣ���Ԫ�ز���������");
		System.out.println(list.header.value);
	}
	
}
