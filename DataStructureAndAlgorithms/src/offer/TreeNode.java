package offer;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val, TreeNode leftChild, TreeNode rightChild) {
		super();
		this.val = val;
		this.left = leftChild;
		this.right = rightChild;
	}
	public TreeNode(int val) {
		super();
		this.val = val;
	}
	@Override
	public String toString() {
		return "Node [value=" + val + ", leftChild=" + left + ", rightChild=" + right + "]";
	}
	
	
}
