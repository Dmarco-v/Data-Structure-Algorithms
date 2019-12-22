package offer;

import java.util.HashSet;
import java.util.Stack;

public class DeleteDuplicationInLinkedList {

	
	public ListNode deleteDuplication(ListNode pHead){
		if(pHead==null) return null;
        HashSet<Integer> set1=new HashSet<Integer>();
        HashSet<Integer> set2=new HashSet<Integer>();
        ListNode p=pHead;
        while(p!=null){
            if(set1.contains(p.val)){
                set2.add(p.val);
            }
            set1.add(p.val);
            p=p.next;
        }
        ListNode res,curNode;
        res=curNode=null;
        p=pHead;
        while(p!=null){
        	if(!set2.contains(p.val)){
        		if(res==null) {
            		res=new ListNode(p.val);
            		curNode=res;
            	}else{
            		curNode.next=new ListNode(p.val);
            		curNode=curNode.next;
            	}
        	}
        	p=p.next;
        }
        return res;
    }
	
	public static void main(String[] args) {
		ListNode pHead=new ListNode(3);
		pHead.next=new ListNode(5);
		pHead.next.next=new ListNode(5);
		pHead.next.next.next=new ListNode(4);
		DeleteDuplicationInLinkedList a=new DeleteDuplicationInLinkedList();
		ListNode node=a.deleteDuplication(pHead);
		System.out.println(node);
		Stack<Integer> stack=new Stack<>();
		Stack<Integer> stack2=new Stack<>();
		stack.push(2200);
		stack2.push(2200);
		Integer s=stack.pop();
		System.out.println(stack2.pop()==s);
		
	}
}
