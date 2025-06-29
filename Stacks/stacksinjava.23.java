/*
import java.util.*;

 class Demostack{

	public static void main(String[]args){
	
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println(s.size());
                System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());


	
	}
} 
*/

// implemetation of stack using array

import java.util.*;
class  StackUsingArray{

	int maxSize;int stackArr[];int top=-1;
	StackUsingArray(int size){
	
		this.stackArr=new int[size];
		this.maxSize=size;

	}
	void push(int data){
	
		if(top==maxSize-1){
		
			System.out.println("Stack is overflow");
		}else{
		
			top++;
			stackArr[top]=data;
		}
	
	}
	boolean empty(){
	
		return top==-1;
	}
	int pop(){
	
		if(empty()){
		
			System.out.println("Stack is empty");
			return -1;
		}else{
		
			int val=stackArr[top];
			top--;
			return val;
		}
	}
	int peek(){
	
		if(empty()){
		
			System.out.println("Stack is empty ");
			return -1;

		}else{
		
			return stackArr[top];
		
		}
	}
	int size(){
	
		return top+1;
	}
	void printStack(){
	
		if(empty()){
	         
			System.out.println("Stack is empty");
			
		}else{
		
			System.out.print("[");
			for(int val=0;val<=top;val++){
			   System.out.print(stackArr[val]+"  ");

			 }
			System.out.println("]");
		}
	}

}
class client{

	public static void main(String[]args){
	
		System.out.println("Enetr the size");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		StackUsingArray  stkua=new StackUsingArray(size);
		char ch;
		do{
		
			System.out.println("1.push");

			System.out.println("2.pop");

			System.out.println("3.peek");

			System.out.println("4.size");


			System.out.println("5.isEmpty");

			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice){
			
				case 1:
					
					{
					
						System.out.println("Enter the  Element to add");
						int data=sc.nextInt();
						stkua.push(data);

					
					}
					break;
				case 2:
					{
					
						int popped=stkua.pop();
						if(popped!=-1){
						
							System.out.println("popped element "+popped);

						}
					}
					break;
				case 3:
					{
					
						int peeked =stkua.peek();
						if(peeked!=-1){
						
							System.out.println("peek element :"+peeked);
						}
					}
					break;
				case 4:
					{
					
						System.out.println("Size of stack "+stkua.size());
					
					}
					break;
				case 5:
					{
					
						System.out.println("is  stack empty "+ stkua.empty());

					}
					break;
				default :
					{
					
						System.out.println("Wring input ");
					}
					break;
			}
			System.out.println("do you wnt to continue?");
			ch=sc.next().charAt(0);

		}while(ch=='Y'||ch=='y');

	}
}

