import java.util.*;
class Node {

	int data;
	Node prev=null;;
	Node next=null;
	Node(int data){
	
		this.data=data;

	}

}
class DoublyLinkedList{

	Node head=null;

	 void addFirst(int data){
                 Node newNode=new Node(data);	
		 if(head==null){
		 
			 head=newNode;
		 }else{
		 
			 head.prev=newNode;
			 newNode.next=head;
			 head=newNode;
		 }

	
	}
	void addLast(int data){
              Node newNode=new Node(data);	
		if(head==null){
		
			head=newNode;
		
		}else{
		
			
			Node temp=head;
			while(temp.next!=null){
			
				temp=temp.next;

			}
			temp.next=newNode;
			newNode.prev=temp;

		}
	
	
	}

	int countNode(){
	
		int count=0;
		Node temp=head;
		while(temp!=null){
		
			count++;
			temp=temp.next;
		}
		return count;

	
	}

	void addAtPos(int pos,int data){
	
		if(pos==1){
		
			addFirst(data);
		
		}else if(pos==countNode()+1){
			addLast(data);
		}else{
		
			Node newNode =new Node(data);
			Node temp=head;
			while(pos-2!=0){
			
				temp=temp.next;
				pos--;
			
			}
			newNode.next=temp.next;
			newNode.prev=temp;
			temp.next.prev=newNode;
			temp.next=newNode;

		}
	}
	void delFirst(){
	
		if(head==null){
		
			System.out.println("List is empty");
			return;
		}else{
		
			if(countNode()==1){
			
				head=null;
			
			}else{
				head=head.next;
				head.prev=null;
			}

		
		}
	
	}
	void delLast(){
	
		if(head==null){
		
			System.out.println("List is empty ");
			return;
		} else{
		
			if(countNode()==1){
			
				head=null;
			}else{
			
				Node temp=head;
				
				while(temp.next.next!=null){
				
					temp=temp.next;

				}
				temp.next=null;
				//temp.next.prev=null;
				temp=temp.next;
				temp.prev=null;

			}
		
		}
	
	}
	void delAtPos(int pos){
	
		if(pos==1){
		
			delFirst();
		}else if(pos==countNode()){
		
			delLast();
		
		}else{
		
			Node temp=head;
			
			while(pos-2!=0){
			
				temp=temp.next;
				pos--;
			}
			temp.next=temp.next.next;
			temp.next.prev=temp;
		}
	
	}
	void printDll(){
	
		if(head==null){
		
			System.out.println("List is empty");
		}else{
		
			Node temp=head;
			while(temp!=null){
			
				System.out.print(temp.data+"  ");
				temp=temp.next;

			}
			System.out.println();
		}
	
	}
}
class client{

	public static void main(String[]args){
	
		DoublyLinkedList dll=new DoublyLinkedList();
		char ch;
		Scanner sc=new Scanner(System.in);
		do{
		
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addAtPos");
			System.out.println("4.delFirst");
			System.out.println("5.delLast");
                        System.out.println("6.delAtPos");
			System.out.println("7.countNodes");
			System.out.println("8.printlist");

			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
			
				case 1:
					{
					
						System.out.println("enter the data");
						int data=sc.nextInt();
						dll.addFirst(data);
					}
					break;
				case 2:
					{
					
						System.out.println("Enter the data");
						int data=sc.nextInt();
						dll.addLast(data);

					}
					break;
				case 3:
					{
					
						System.out.println("Enter the data ");
						int data=sc.nextInt();
						System.out.println("Enter the position ");
						int pos=sc.nextInt();
						dll.addAtPos(pos,data);

					}
					break;
				case 4:
					{
					  dll.delFirst();

					}
					break;
				case 5:
					{
					
						dll.delLast();
					}
					break;
				case 6:
					{
					
						System.out.println("Enter the position ");
						int pos=sc.nextInt();
						dll.delAtPos(pos);


					}
					break;
				case 7:
					{
						int count=dll.countNode();
                                                System.out.println(count);
					
					}
					break;
				case 8:
					{
					
						dll.printDll();
					}
					break;
				default:
					System.out.println("Wrong input");
					break;

			
			}
			System.out.println("Continue?");
			ch=sc.next().charAt(0);

		}while(ch=='Y'||ch=='y');
	
	}

}
