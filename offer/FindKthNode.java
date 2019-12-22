package offer;

public class FindKthNode {

	
    int index=0;//������
    TreeNode KthNode(TreeNode pRoot, int k){
        if(pRoot!=null) {
            //����������
            TreeNode node=KthNode(pRoot.left,k);
            if(node!=null){
            	return node;
            }
            //�жϵ�kС���ǲ��Ǹ��ڵ�
            index++;
            if(index==k) return pRoot;
            //����������
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
