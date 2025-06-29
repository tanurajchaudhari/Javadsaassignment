// implement a circular queue


import java.util.*;
class CircularQueue{

	int queueArr[];int maxSize;
	int front;
	int rear;
	CircularQueue(int size){
	
		this.queueArr=new int[size];
		this.maxSize=size;
		this.front=-1;
		this.rear=-1;
	}
	void enqueue(int data){
	
		if((front==0&& rear==maxSize-1)||(((rear+1)%maxSize)==front)){
		
			System.out.println("Queue is full");
			return;

		}else if (front==-1){
		
			front=rear=0;


		}else if(rear==maxSize-1 && front !=0){
		
			rear=0;
		}else{
		  
			rear++;

		}
		queueArr[rear]=data;
	}
	int dequeue(){
	
		if(front==-1){
		
			System.out.println("Queue is empty ");
			return -1;
		}else{
		
			int ret =queueArr[front];
			if(front==rear){
			
				rear=front=-1;
			}else if(front==maxSize-1){
			
				front =0;
			}else{
			
				front++;
			}
			return ret;
		}
	}
	void printQueue(){
	
		if(front<=rear){
		
			for(int i=front;i<=rear;i++){
			
				System.out.print(queueArr[i]+" ");
			}
		}else{
		
			for(int i=front;i<maxSize;i++){
			
				System.out.print(queueArr[i]+" ");
			}
			for(int i=0;i<=rear;i++){
			
				System.out.print(queueArr[i]+" ");

			}
		

		}
		System.out.println();

	}

}
class client{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=sc.nextInt();
		CircularQueue cq=new CircularQueue(size);
		char ch;
		do{
		
			System.out.println("1.enqueue");
			System.out.println("2.enqueue");
			System.out.println("3.print queue");
			System.out.println("4.Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
			
				case 1:
					{
					
			                   System.out.println("enter  the data");
					   int data=sc.nextInt();
					   cq.enqueue(data);
					}
					break;

				case 2:
					{
					
			                   //System.out.println("enter  the data");
					   //int data=sc.nextInt();
					   cq.dequeue();
					}
					break;

				case 3:
					{
					
			                 //  System.out.println("enter  the data");
					   //int data=sc.nextInt();
					   cq.printQueue();
					}
					break;

				default:
					{
					
			                   System.out.println("wrong input ");
					   //int data=sc.nextInt();
					   //cq.enqueue(data);
					}
					break;
			}
			System.out.println("do you want to continue?");
			ch=sc.next().charAt(0);

		}while(ch=='Y'||ch=='y');
	}

}
