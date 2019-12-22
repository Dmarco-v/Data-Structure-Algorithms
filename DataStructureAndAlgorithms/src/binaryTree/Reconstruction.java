package binaryTree;
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

public class Reconstruction {
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBinaryTree(pre,in,0,pre.length-1,0,in.length-1);
        return root;
    }
    public static TreeNode reConstructBinaryTree(int []pre,int []in,int preStart,int preEnd,int inStart,int inEnd){
        
        if(preStart>preEnd||inStart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(pre[preStart]);
        for(int i=inStart;i<inEnd+1;i++){
            if(in[i]==pre[preStart]){
                root.left=reConstructBinaryTree(pre,in,preStart+1,preStart+i-inStart,inStart,i-1);
                root.right=reConstructBinaryTree(pre,in,preStart+i-inStart+1,preEnd,i+1,inEnd);
                break;
            }
        }
        return root;
    }

    
    public static void main(String[] args) {
		int[] pre={1,2,3,4,5,6,7};
		int[] in={3,2,4,1,6,5,7};
		
		TreeNode root=reConstructBinaryTree(pre,in);
		System.out.println(root.val);
	}
}
