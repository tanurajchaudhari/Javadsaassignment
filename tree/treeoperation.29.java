class Treenode{

	int data;TreeNode left;TreeNode right;
	TreeNode(int data){
	
		this.data=data;
		left=right=null;

	}

}
class BinaryTree{

	int index=-1;
	TreeNode constructBt(int nodeArr[]){
	
		index++;
		if(nodeArr[index]==-1){
		
			return null;
		}
		TreeNode newNode=new TreeNode(nodeArr[index]);
		newNode.left=constructBt(nodeArr);
		newNode .right=consructBT(nodeArr);
		return newNode;

	}
	void preOrderBt(TreeNode root){
	
		if(root==null)
			return;
		System.out.print(data+"  ");
		preOrderBT(root.left);
		preOrderBT(root.right);

	}
	void postOrderBT(TreeNode root){
	
		if(root==null){
		
			return ;

		}
		postOrderBT(root.left);
		//System.out.print(root.data+"  ");
		postOrderBT(root.right);
		System.out.print(root.data+"  ");

	}
	void inOrderBt(TreeNode root){
	
		if(root==null)
			return;
		inOrderBT(root.left);
		System.out.print(root.data+"  ");
		inOrderBT(root.right);
	}
	int countNodes(TreeNode root){
	
		if(root==null)
			return 0;
		int leftSTNode=countNodes(root.left);
		int rightSTNode=countNodes(root.right);
		return  leftSTNode+rightSTNode+1;
	}
	///  level order traversal   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	void levelOrder(TreeNode root){
	
		Queue <TreeNode>que=new LinkedList<>();
		que.add(root);que.add(null);
		while(!que.isEmpty()){
		
			TreeNode tempNode = que.remove();
			if(tempNode==null){
			
				System.out.println();
				if(que.isEmpty()){
				
					break;
				}else{
				
					 que.add(null);
				}
			}else{
			
				System.out.print(tempNode.data+"  ");
				if(tempNode.left!=null)
					que.add(tempNode.left);
				if(tempNode.right==null)
					que.add(tempNode.right);
			}
		}
	}
	//sum of bt
	int sumofBT(TreeNode root){
	
		if(root==null)
			return 0;
		int sumoflst=sumofBT(root.left);
		int sumofrst=sumofBt(root.right);
		return sumoflst+sumofrst+root.data;

	}
	//heigth of BT
	int heightBT(TreeNode root){
	
		if(root==null)
			return 0;
		int LStHeight=heightofBT(root.left);
		int RSTHeight=heightofBT(root.right);
		int treehieght=max(LSTHeight,RSTheight)+1;
		return treeHeight;
	}
	int max(int LstHeight,RSTHeight){
	
		if(LSTHeight<=RSTHeight){
		
			return RSTHeight;

		} else{
		
			return LSTHeight;
		}
	}
	public static void main(String[]args){
	
		int nodeArr[]={1,2,3,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinarTreebt=new BinaryTree();
		TreeNode root=bt.constructBT(nodeArr);
		bt.preOrderBT(root);
		System.out.println();
		bt.inOrderBT(root);
		System.out.println();
		bt.postOrderBT(root);
		System.out.println();
		int count=bt.countNodes(root);
		System.out.println("Total count = "+count);
		
		bt.levelOrder();

		System.out.println("TreeHeight is "+bt.heightofBT);
		System.out.println("sumof binary tree is "+bt.sumofBT);

	}
}
