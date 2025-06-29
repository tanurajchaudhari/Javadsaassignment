//implementation of  queue can be done by array as well as linked list 
import java.util.*;

class Queue{

	int queueArr[];int front;int rear;
	int maxSize;
	Queue(int size){
	
		this.queueArr=new int[size];
		this.front=-1;
		this.rear=-1;
		this.maxSize=size;
	}
	void enqueue(int data){
	
		if(rear==maxSize-1){
		
			System.out.println("Queue is full");
			return;
		}else if (front==-1){
			front=rear=0;
		
	
		}else{
		
			rear++;

		}
		queueArr[rear]=data;
	


	}
	int dequeue(){
	
		if(front==-1){
		
			System.out.println("Queue is empty ");
			return -1;
		} else{
		
			int ret=queueArr[front];
			front++;

			if(front>rear){
			
				front=rear=-1;
			}
			return ret;
		}
	}
	boolean isEmpty(){
	
		if(front==-1){
		
			return true;
		}else{
		
			return false;
		}
	
	}
	int front(){
	
		if(front==-1){
		
			System.out.println("Queueis empty");
			return -1;
		}else{
		
			return queueArr[front];

		}
	}
	int rear(){
	
		if(rear==-1){
		
			System.out.println("Queue is empty");
			return -1;

		}else{
		
			return queueArr[rear];

		}
	}
	void printQueue(){
	
		if(front==-1){
		
			System.out.println("Queue is empty");

		}else{
		      for(int i=front;i<=rear;i++){
			 System.out.print(queueArr[i]+" ");
		      }
		      System.out.println();
		}
	}

}
class client{

	public static void main(String []args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the aray  size");
		int size=sc.nextInt();
		Queue q=new Queue(size);
		char ch;
		do{
		
			System.out.println("1.enqueue th data");

			System.out.println("2.dequeue th data");
			System.out.println("3. empty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.printQueue");
			System.out.println("Enter your choice ");
			int choice=sc.nextInt();
			switch(choice){
			
				case 1:
					{
					
						System.out.println("Enter the data ");
						int data=sc.nextInt();
						q.enqueue(data);
					}
					break;
				case 2:
					{
					
						int ret=q.dequeue();
						if(ret!=-1){
						
							System.out.println(ret+"  Popped");
						}
					}
					break;
				case 3:
					{
					
						boolean ret=q.isEmpty();
						if(ret){
						
							System.out.println("Queue is empty");
						}else{
						
							System.out.println("Queueis not empty");
						}
					}
					break;
				case 4:
					{
					
						int ret=q.front();
						if(ret!=-1){
						
							System.out.println("front element is "+ ret);
						}
					}
					break;
				case 5:
					{
					
						int ret =q.rear();
						if(ret!=-1){
						
							System.out.println("rear element is "+ret);
						}
					}
					break;
				case 6:
					{
					
						q.printQueue();
					}
					break;
				default:
					System.out.println("Wrong input");
					break;

			}
			System.out.println("Do you want to continue ?");
			ch=sc.next().charAt(0);

		}while(ch=='Y'||ch=='y');

	}
}






























