package offer;

public class FindKthNode {

	
    int index=0;//计数器
    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot!=null) {
            //遍历左子树
            TreeNode node=KthNode(pRoot.left,k);
            if(node!=null){
            	return node;
            }
            //判断第k小的是不是根节点
            index++;
            if(index==k) return pRoot;
            //遍历右子树
            node=KthNode(pRoot.right,k);
            if(node!=null) {
            	System.out.println(node.val);
            	return node;
            }
        }
        return null;
    }

	public static void main(String[] args) {
		TreeNode bsTreeRoot=new TreeNode(4);
		bsTreeRoot.left=new TreeNode(2);
		bsTreeRoot.left.left=new TreeNode(1);
		bsTreeRoot.left.right=new TreeNode(3);
		bsTreeRoot.right=new TreeNode(6);
		bsTreeRoot.right.left=new TreeNode(5);
		bsTreeRoot.right.right=new TreeNode(7);
		FindKthNode findKthNode=new FindKthNode();
		TreeNode node=findKthNode.KthNode( bsTreeRoot,4);
		System.out.println(node.val);
	}
	
}
