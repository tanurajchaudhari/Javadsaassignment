import java.util.*;
class Node{

	int data;
	Node next=null;
	Node(int data){
	
		this.data=data;

	}

}
//SiglyLinkedList class represents a singly linkedlist and various operations 
class SinglyLinkedList{

	Node head=null;

	//Add a new node to the linked list at the beginning  of linked list
	void addFirst(int data){
	
		Node  newNode=new Node(data);
		if(head==null){
		
			head=newNode;
		}else{
		
			newNode.next=head;
			head=newNode;
		}

	

	}

	//Add a new node to the end of the linked list 
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

		}
	}

	//count the number of nodes in the linkedlist
	int countNodes(){
	
		Node temp=head;
		int count=0;
		while( temp!=null){
		
			count++;
			temp=temp.next;
		
		}
		return count;
	}

	//Add a new node at a specified position in the linkedlist
	
	void addAtPos(int pos,int data){
	
		//Node newNode=new Node(data);
		if(pos==1){
		     
			addFirst(data);
		}else if(pos==countNodes()+1){
			addLast(data);		
		}else{
		
			Node newNode=new Node(data);
			Node temp=head;
			while(pos-2!=0){
			
				temp=temp.next;
				pos--;

			}
			newNode.next=temp.next;
			temp.next=newNode;
		}

	}

	//Delete the first Node in the linkedlist
	void delFirst(){
	
		if(head==null){
		
			System.out.println("List is empty");
			return;
		}else{
		
			if(countNodes()==1){
			
				head=null;

			}else{
			
				head=head.next;
			}
		}

	}

	//Delete the last Node 
	void delLast(){
	
		if(head==null){
		
			System.out.println("List is Empty");
			return;
		}else if(countNodes()==1){
		
			head=null;
		}else{
		
			Node temp=head;
			while(temp.next.next!=null){
			
				temp=temp.next;
			}
			temp.next=null;

		}

	}
        //Deleted a Node at a Specific position in the linkedlist 
        void delAtPos(int pos){
	
		if(pos==1){
		
			delFirst();
		}else if(pos==countNodes()){
		
			delLast();

		}else{
		
			Node temp=head;

			while(pos-2!=0){
			
				temp=temp.next;
			        pos--;
			}
			temp.next=temp.next.next;
		}
	}

       // print the element of the linkedlist
        void printList(){
	
		if(head==null){
		
			System.out.println("List is Empty");
		}else{
		
			Node temp=head;
			while(temp!=null){
			        if(temp.next==null){
				
					System.out.print(temp.data);
				
					temp=temp.next;

				}else{
				  System.out.print(temp.data+"->");
				  temp=temp.next;
                                }
			}
			System.out.println();
		}
	}	

}
//client class to intreact with the linkedlist and perform operations based on userinput
class Client{

	public static void main(String[]args){
	
		SinglyLinkedList ll=new SinglyLinkedList();
		char ch;
		do{
		
			System.out.println("1.addFirst");
			System.out.println("2.addLast");
			System.out.println("3.addatPos");
			System.out.println("4.delFirst");
			System.out.println("5.delLast");
			System.out.println("6.delAtPos");
			System.out.println("7.countNodes");
			System.out.println("8.printList");

			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);

			int choice =sc.nextInt();
			switch(choice){
			
				case 1:
					{
					
						System.out.println("Enter the data");
						int data=sc.nextInt();
						ll.addFirst(data);
					}
					break;
				case 2:
					{
					
						System.out.println("Enter the data");
						int data=sc.nextInt();
						ll.addLast(data);

					}
					break;
				case 3:
					{

                                                System.out.println("Enter the data");
                                                int data=sc.nextInt();
						System.out.println("Enter the position ");
						int pos=sc.nextInt();

                                                ll.addLast(data);


					}
					break;
				case 4:
					{
					
						ll.delFirst();

					}
					break;
				case 5:
					{
					
						ll.delLast();
					}
					break;
				case 6:
					{
					
						System.out.println("Enter the position ");
						int pos=sc.nextInt();
						ll.delFirst();

					
					}
					break;
				case 7:
					{
					
						int count=ll.countNodes();
						System.out.println(count);
					
					}
					break;
				case 8:
					{
					
						ll.printList();
					}
			                break;

				default:
					System.out.println("Wrong input");
					break;

			}
		
			System.out.println("Do you want to continue ? ");
			ch=sc.next().charAt(0);

		}while(ch=='Y' || ch=='y');
	}

}
