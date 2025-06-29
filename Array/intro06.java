/*
 Given an array of size print all the elements 
 * */
/*
class ArrayDemo{

	public static void main (String[]args ){
	
		int arr []=new int []{5,6,2,3,1,9};
		int N=6;
		for(int i =0;i<N;i++){
		
			System.out.print(arr[i]+"  ");

		}
	}
}
*/
/*
//Q.2) Given an integer array of  size N  , Count  the number of element  having at least  1  element  grater than  itself 
class ArrayDemo1{

	public static void main(String[]args ){
	
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
		int count =0;
		int N=arr.length;

		for(int  i=0;i<N;i++){
		
			for(int j=0;j<N;j++){
			
				if(j>i){
				
					count++;
					break;

				
				}
			}
		}
	
       System.out.print(count);
       System.out.println();



	}
}

*/
//optimise approach 
/*
class ArrayDemo1{

	public static void main(String[]args){
	  int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
          int  Max=Integer.MIN_VALUE;
	  int count=0;
	  int N=arr.length;
	  for(int i=0;i<N;i++){
	  
		  if(arr[i]>Max)
			  Max=arr[i];

	  }
	  for(int i=0;i<N;i++){
	  
		  if(arr[i]==Max){
		   
			  count++;

		  }
	  
	  }
	  System.out.println(N-count);

	}
}
*/

/*
//Q.3 Given an array of size N return  the amount of pairs (i,j)with arr[i]+arr[j]=k
  //  k=10; and 
  //  note : i!=j;
  //  output:6;
class  ArrayDemo3{

	public static void main(String[]args ){
	
		int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
		int N=arr.length;
		int K=10;
		int count=0;

		for(int i=0;i<N;i++){
		
			for(int j=i+1;j<N;j++){
			
				if(arr[i]+arr[j]==K)
					count++;


			
		              }
		}
		System.out.println(count*2);
	}
	
}
*/

/*
//Q4Given an arry of size N, Reverse the array without using extra space
class arrayDemo4{

	public static void main(String[]args ){
	
		int arr[]=new int []{8,4,1,3,9,2,6,7};
		int j=arr.length-1;
		for(int i=0;i<j;i++){
		
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;

			j--;
		}
                 for(int i=0;i<arr.length;i++){
		 
			 System.out.print(arr[i]+"  ");

		 
		 
		 }
	

	
	}
}
*/

//Q5 print the second largest number in the array
class ArrayDemo5{

	public static void main(String[]args ){
	
		int arr[]=new int []{8,4,1,3,9,2,6,7};
		int N=arr.length;
		int  max=Integer.MIN_VALUE;

	        for(int i=0;i<N;i++){
		
			if(arr[i]>max)
				max=arr[i];

		}
               int max2=Integer.MIN_VALUE;

		for(int i=0;i<N;i++){
		
			if(arr[i]>=max2 && arr[i]<max)
				max2=arr[i];
		}
		System.out.println(max2);



	
	}
}












