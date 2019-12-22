package offer;

public class ListNode {

	int val;
	ListNode next=null;
	
	public ListNode(int val) {
		super();
		this.val = val;
	}

	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer("[");
		ListNode p=this;
		while(p!=null){
			sb.append(p.val+" ");
			p=p.next;
		}
		sb.append("]");
		return sb.toString();
	}
	
	
	
}
