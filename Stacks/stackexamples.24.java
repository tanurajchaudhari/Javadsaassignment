//Q.1 reverse the string using sack
/*
import  java.util.*;
class ReverseString {

	String revstring(String str){
	
		char stackArr[]=new char[str.length()];
                Stack <Character> s=new Stack<Character>();
		for(int i=0;i<str.length();i++){
		
			s.push(str.charAt(i));
		}
		int i=0;
		while(!s.empty()){
		
			stackArr[i]=s.pop();
			i++;
		}
		return new String(stackArr);
	}
}
class client{

	public static void main(String[]args){
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the  string to reverse ");
		String str=sc.next();
		ReverseString obj=new ReverseString();
	       String revstr = obj.revstring(str);
	       System.out.println(revstr);

	}
}
*/

//Q.2)  two stack using ar array
/*
import java.util.*;
class TwoStacksArray{

	int stackArr[];
	int top1;int top2;int maxSize;
	TwoStacksArray(int size){
	
		this.maxSize=size;
		this.stackArr=new int[size];
		this.top1=-1;
		this.top2=size;
	}
	void push1(int data){
	
		if(top2-top1>1){
		
			top1++;
			stackArr[top1]=data;

		} else{
		
			System.out.println("SStackis overflow");
		}
	}
	void push2(int data){
	
		if(top2-top1>1){
		
			top2--;
			stackArr[top2] =data;

		}else{
		
			System.out.println("stack overflow");
		}
	}
	int pop1(){
	
		if(top1==-1){
		
			System.out.println("Stack is empty");
			return -1;
		}else{
		
			int val = stackArr[top1];
			top1--;
			return val;
		}
	}
	int pop2(){
	
		if(top2==maxSize){
		
			System.out.println("Stack is empty");
			return -1;
		}else{
		 
			int val=stackArr[top2];
			top2++;
			return val;


		}
	}

} 
class client{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size =sc.nextInt();
		TwoStacksArray obj= new TwoStacksArray(size);
		char ch;
		do{
		
			System.out.println("1.push1");
                         
			System.out.println("2.push2");
			System.out.println("3.pop1");
			System.out.println("4.pop2");
			System.out.println("Enter your choice ");
			int choice =sc.nextInt();
			switch(choice){
			
				case 1:
					{
					
						System.out.println("Enter  element for stack1");
						int data=sc.nextInt();
						obj.push1(data);
					}
					break;
				case 2:
					{
				            	
						System.out.println("Enter  element for stack2");
						int data=sc.nextInt();
						obj.push2(data);

					}
					break;
		               case 3:
					{
					
						int ret=obj.pop1();
						if(ret!=-1){
						  System.out.println(ret +" Popped");
						}

					}
					break;
				case 4:
					{
					
						int ret=obj.pop2();
						if(ret!=-1){
						
							System.out.println(ret+"popped");
						}
					}
					break;
				default:
					{
					
						System.out.println("Wrong input");

					}
					break;


			}
			System.out.println("Do you want to continue ?");
			ch=sc.next().charAt(0);

		}while(ch=='Y'||ch=='y');
	}
}
*/
/*
//Q.3.merge of two sorted array

import java.util.Stack;
class MergeStack{

	Stack stackmerger(Stack s1,Stack s2){
	
		Stack s3=new Stack();
		while(!s1.empty()&&!s2.empty()){
		
			if((Integer)s1.peek()> (Integer)s2.peek()){
			
				s3.push(s1.pop());
			}else{
			
				s3.push(s2.pop());
			}
		}
		while(!s1.empty()){
		
			s3.push(s1.pop());
		}
		
		while(!s2.empty()){
		
			s3.push(s2.pop());
		}
		while(!s3.empty()){
		
			s2.push(s3.pop());
		}
		return s2;
	}
}
class client{

	public static void main(String[]args){
	
		//Stack  s1=new Stack<>();
		Stack <Integer>s1=new Stack<Integer>();
		Stack <Integer>s2=new Stack<Integer>();
	//	Stack  s2=new Stack<>();
		s1.push(10);
		s1.push(30);
		s1.push(50);
		s1.push(80);
		s1.push(120);
		s1.push(130);

		s2.push(20);
		s2.push(40);
		s2.push(60);
		s2.push(70);
		s2.push(90);
		s2.push(100);
		s2.push(110);


		MergeStack obj=new MergeStack();
		Stack s3=obj.stackmerger(s1,s2);
		System.out.println(s3);		
	}
}
*/

//Q.3)paranthesis checker 
import java.util.*;
class ParenthesisChecker{

	boolean validparanthesis(String str){
	     Stack<Character> s=new Stack<Character>();
	     for(int i=0;i<str.length();i++){
	     
		     char ch=str.charAt(i);
		     if(ch=='{'||ch=='('||ch=='['){
		     
			     s.push(ch);
		     }else{
		     
			     if(!s.empty()){
			     
				     char x=(char)s.peek();
				     if(x=='['&&ch==']'||x=='{'&&ch=='}'||x=='('&&ch==')'){
				     
					     s.pop();
				     } else{
				     
					     return false;
				     }
			     
			     }else{
			     
				     return false;

			     }
		     }
	     }
	     if(s.empty()){
	    
		    return true;
	     }else{
	    
		    return false;
	     }
	}
}
class clientChecker{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the expression");
		String str=sc.next();
		ParenthesisChecker obj=new ParenthesisChecker();
		boolean ret=obj.validparanthesis(str);
		if(ret){
		
			System.out.println("Balanced");
		}else{
		
			System.out.println("Not Balanced");
		
		}
	}
}
