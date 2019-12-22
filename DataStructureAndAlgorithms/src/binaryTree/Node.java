package binaryTree;

public class Node {

	private Object value;
	private Node leftChild;
	private Node rightChild;
	public Node(Object value, Node leftChild, Node rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	public Node(Object value) {
		super();
		this.value = value;
	}
	@Override
	public String toString() {
		return "Node [value=" + value + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}
	
	
}
