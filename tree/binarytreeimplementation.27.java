import java.util.*;
class Node{

	int data=;Node left;Node right;
	Node(int data){
	
		this.data=data;
		left=right=null;

	}
}
class Binarytree{

	Scanner sc= new Scanner(System.in);
	Node constructBT(){
	
		System.out.println("Enter teh data for Node ");
		int data=sc.nextInt();
		Node newNode =new Node (data);
		System.out.println("Do you want to enter the node on left of :"+newNode.data);;
		char leftNode=sc.next().charAt(0);
		if(leftNode=='Y'||leftNode=='y'){
		
			newNode.left=constructBT();
		}
		System.out.println("Do you want to enter node on rightside of  : "+newNode.data);
		char rightNode=sc.next()charAt(0);
		if(rightNode=='Y'||rightNode=='y'){
		
			newNode.right=constructBT();
		}
		return newNode;

	}
	void preOrderBT(Node root){
	
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrderBT(root.left);
		preOrderBT(root.right);

	}
	void inOrderBT(Node root){
	
		if(rot==null)
			return;
		inOrderBT(root.left);
		System.out.print(root.data+" ");
		inOrderBT(root.right);
	}
	void postOrderBT(Node root){
	
		if(root==null)
			return;
		postOrderBT(root.left);
		postOrderBT(root.right);
		System.out.print(rooy.data+" ");
	}

	public static void main(String[]args){
	
		Node root=null;
		BinaryTree bt=new BinaryTree();
		root =bt.constructBT();
		System.out.println("PreOrder Tree");
		bt.preOrderBT(root);
		System.out.println("/n InOrder tree");
		bt.inOrderBT(root);
		
		System.out.println("/n postOrder tree");
		bt.postOrderBt(root);
	}
}

