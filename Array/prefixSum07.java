/*
import java.io.*;

class  One{

	public static void main(String[]args )throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in ));
                System.out.println("Enter the starting index ");
		int S=Integer.parseInt(br.readLine());
                System.out.println("Enter the ending index ");
		int E=Integer.parseInt(br.readLine());

		int arr[]=new int []{2,5,3,11,7,9,4};
		int sum = 0;
		for(int i =S;i<=E;i++){
		
			sum=sum+arr[i];

		
		}
		System.out.println(sum);                	
	
	}


}
*/


//Q1 Given an array of size N and Q  number of  Queries  Query contains  two parameter (S,E). S=> Start index and e=> End index  for all  querise , print  the sum of all element from index  s to index e 

/*
import java.io.*;
class QueryDemo{

	public static void main(String[]args )throws IOException {
                int arr[]=new int []{-3,6,2,4,5,2,8,-9,3,1};	
 		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter the number of queries : ");
		int Q=Integer.parseInt(br.readLine());
		for(int i=1;i<=Q;i++){
		
			int sum =0;
			System.out.println("Enter the Starting index numbee ");
			int S=Integer.parseInt(br.readLine());
			System.out.println("Enter the  ending index  number ");
			int E = Integer.parseInt(br.readLine());
                        
			while(S<=E){
			   sum=sum+arr[S];
			   S++;

			
			}
		        System.out.println("Sum of Query "+ i + " :-  "+sum );

		
		}
	
	}

}


*/
/*
//Q.1) print prefixSum  
class  PrefixSum {

	public static void main(String[]args ){
	
		int arr[]=new int []{-3,6,2,4,5,2,8,-9,3,1};
		int pSum[]=new int [arr.length];
		pSum[0]=arr[0];
		for(int i=1;i<pSum.length;i++){
		
			pSum[i]=pSum[i-1]+arr[i];
		}
		for(int i=0;i<pSum.length;i++){
		
			System.out.print(pSum[i]+"  ");

		
		
		}
	
	
	
	}

}
*/

/*
//Q3 RangeSum

import java.util.*;

class  RangeSum{

	public static void main(String[]args ){
	
	int arr[]=new int []{-3,6,2,4,5,2,8,-9,3,1};
	int N=arr.length;
	int Q=3;
	int pSum[]=new int [N];
	   pSum[0]=arr[0];

	for(int i=1;i<N;i++){
	
		pSum[i]=pSum[i-1]+arr[i];
	
	}
        Scanner sc= new Scanner(System.in);
         
	for(int i=0;i<Q;i++){
	        int Sum=0;
	    	int StartIndex=sc.nextInt();
		int EndIndex=sc.nextInt();
              

		if(StartIndex==0)
			Sum=pSum[EndIndex];
		else
			Sum=pSum[EndIndex]-pSum[StartIndex-1];




		System.out.println(Sum);

	
	}
	
	
	
	}


} 

*/

/*
//Q perfixSum  i place 
//
//
class inPlacePrefixSum{

	public static void main(String[]args ){
	
         int arr[]=new int []{-3,6,2,4,5,2,8,-9,3,1};

	 //int pSum[]=new int [arr.length];
         

	 for(int i=1;i<arr.length;i++){
	 
		 arr[i]=arr[i-1]+arr[i];
	 
	 }
	 for(int i=0;i<arr.length;i++){
	 
		 System.out.print(arr[i]+"  ");
	 
	 }
	
	}

}

*/

/*
//Q  count element , Given  an  array A  of N  integer, count the number of element  that have  at least 1 element  greater than itself 


class  countelement{
 
	public static void main(String[]args){
	
               //int arr[]=new int[]{3,1,2};
		int arr[]=new int[]{5,5,3};


		int maxele=Integer.MIN_VALUE;
                int count=0;
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>maxele)
				maxele=arr[i];

		}
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]<maxele)
				count++;
		
		}

		System.out.println(count);


	
	}

}
*/
//Q rotate the array
















