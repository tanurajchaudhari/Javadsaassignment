// find the largest element in range of subarray
/*
class carry{

	public static void main(String[]args ){
	
		int arr[]=new int []{3,4,5,1,2,7,9,8};
		int p=3; int maxval=Integer.MIN_VALUE;
		for(int i=0;i<p;i++){
		
			if(arr[i]>maxval)
				maxval=arr[i];

		}
	 System.out.println(maxval);
	
	}

}
*/

//Q1. Given an integer array of size N . build an array LeftMax of size N. Leftmax of i contains the maximum for the index 0 to index i 
/*
class demo{

	public static void main(String[]args ){
	
		int arr[]=new int []{3,6,2,4,5,2,8,-9,3,1};
		int N=arr.length;
		int leftMax[]=new int [N];
                //int  maxval=Integer.MIN_VALUE;

		for(int i=0;i<N;i++){
		   int  maxval=Integer.MIN_VALUE;
			for(int j=0;j<i;j++){
			
				if(maxval<arr[j])
					maxval=arr[j];
			
			}
			leftMax[i]=maxval;

		
		}

	     for(int i=0;i<N;i++){
	  
		  System.out.println(leftMax[i]+"  ");
	  
	     }

	  
	  }	
}
*/
/*
//optmise approach
import java.io.*;

class leftmaxarray{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
                
	

		System.out.println("Enter the length of  array");
		
		int N=Integer.parseInt(br.readLine());
                 
		int arr[]=new int [N];
		for(int i=0;i<N;i++){
		
			System.out.println("Enter the "+i+ " th element ");
			 arr[i]=Integer.parseInt(br.readLine());

		}
		for(int i=0;i<N;i++){
		
			System.out.print(arr[i]+"  ");

		}
	        

	    
	}
}
*/
/*
//another approach 
class leftMaxarray{

	public static void main(String[]args ){
	
		int arr[]=new int []{-3,6,2,4,5,2,8,-9,3,1};
		int N=arr.length;
		int leftMax[]=new int [N];
		leftMax [0]=arr[0];
		for(int i=1;i<N;i++){
		
			if(leftMax[i-1]<arr[i])
				leftMax[i]=arr[i];
			else
				leftMax[i]=leftMax[i-1];
		}
	    
		for(int i=0;i<N;i++){
		
			System.out.print(leftMax[i]+"  ");

		
		}
	}

}
*/

/*
//Q2  Given an integer array of size N . Build  an array rightMax of size N. RightMax of i contains the maximum for the index i to the index  N-1 
class rightMaxarray{

	public static void main(String[]args){
	
		int arr[]=new int []{-3,6,2,4,5,2,8,-9,3,1};
		int N=arr.length;
		int rightMax[]=new int [N];
		rightMax[N-1]=arr[N-1];

		for(int i=N-2;i>=0;i--){
		
			if(arr[i]>rightMax[i+1])
				rightMax[i]=arr[i];
			else
				rightMax[i]=rightMax[i+1];

		
		}
		for(int i=0;i<N;i++){
		
			System.out.print(rightMax[i]+"  ");
		}

	
	}
}
*/
/*
//Q.3) Given  an character array (lowerCase), retuirn the count of pair (i,j) such tat 
//a) i<j           b)arr[i]='a'  and arr[j]='g'
class googleQuetions {

	public static void main(String[]args){
	
		char arr[]=new char []{'a','b','e','g','a','g'};
		int count=0;
		int N=arr.length;

		 for(int i=0;i<N;i++){
		   if(arr[i]=='a')

			 for(int j=i+1;j<N;j++){
			 
				 if( arr[j]=='g')
					 count++;

			 
			 }
		 }
		 System.out.println("Count is :- "+count);

	
	}

}
*/
/*
//Optimise approachb 
class google {

	public static void main(String[]args ){
                char arr[]=new char []{'a','b','e','g','a','g','g'};
                int count=0;
                int N=arr.length;

		int pairs=0;

		int countofA=0;

		for(int i=0;i<N;i++){
		
			if(arr[i]=='a'){
			
				countofA++;
			}else if(arr[i]=='g'){
			
				pairs=pairs+countofA;

			}
		
		}
		System.out.println("count  is :- "+pairs);

	
	
	}

}
*/


