
//Q.1)search the eement in the array ,having time complexity :- O(N) ans space cmplexity i:O(1)
//Constraints 
//1<=n<=10^6
//0<=arr[i]<=10^6
//0<=x<=10^5
/*
import  java.io.*;

class one{
        
        void arrayinput(int N,int arr[],BufferedReader br)throws IOException{
	  for(int i=0;i<N;i++){
	  
		  arr[i]=Integer.parseInt(br.readLine());

	  }
	 }
	 int findElement(int x,int arr[]){
	 
		 for(int i=0;i<arr.length;i++){
		 
			 if(arr[i]==x){
			 
				 return i;
			 }
		 }
		 return -1;
	 }
	
	public static void main(String[]args)throws IOException{

	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the length of array ");
	  int N = Integer.parseInt(br.readLine());
	  int arr[]=new int[N];
	  one o=new one();
	  o.arrayinput(N,arr,br);
	  System.out.println("Enter the element which you want to find in the array");
	  int x=Integer.parseInt(br.readLine());
	  int result= o.findElement(x,arr);
	  if(result!=-1){
	  
		  System.out.println("Element found at :- "+result);
	  }else{
	  
		  System.out.println("Number is not found ");
	  }


	}

}

*/

//Q.2)find theminimum and maximun element in the array having T .C=(N) and A.S is O(1);N<=10^5 and arr[i]<10^12
/*
import java.io.*;
class two{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        void arrayinput(int N,int arr[])throws IOException{
          for(int i=0;i<N;i++){

                  arr[i]=Integer.parseInt(br.readLine());

          }
         }
          int findMax(int N,int arr[]){
	  
		  int max=Integer.MIN_VALUE;
		  for(int i=0;i<arr.length;i++){
		  
			  if(arr[i]>max){
			  
				  max=arr[i];
			  }
		  
		  }
		  return max;


	  
	  }
	  int findMin(int N,int arr[]){
	  
		  int min=Integer.MAX_VALUE;
		  for(int i=0;i<arr.length;i++){
		  
			  if(arr[i]<min){
			  
				  min=arr[i];
			  }
		  }
		  return min;
	  }


	public static void main (String [] args )throws IOException{
          two o=new two();
	  System.out.println("Enter the length of array ");
          int N = Integer.parseInt(o.br.readLine());
          int arr[]=new int[N];
          //one o=new one();
          o.arrayinput(N,arr);
	  System.out.println("MAximum number in the array is :- "+o.findMax( N,arr));
	  System.out.println("Minimum number in the array is :- "+o.findMin( N,arr));
	
       

	}
}
*/
// Q.3) given an array of size n . the tsak is to find the klargest element in  it.having T.C:- O(N) and S.C:- O(1) ,
// constraints N<=10^3 and A[i] <=10^3 , duplicate element  allowed 
/*
import java .util.*;

class three {
        void arrayinput(int N,int arr[],Scanner sc){
	   for(int i=0;i<N;i++){
	   
		   arr[i]=sc.nextInt();

	   }

	} 
	int largestElement(int arr[]){
	
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
		
			if(max<arr[i]){
			
				max=arr[i];
			}
		}
		return max;

	}
	public static void main(String[]args){
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the length of array");
         int N=sc.nextInt();	 
	 int arr[]=new int[N];
         System.out.println("Enter the element of array ");
	 three th=new three();
	 th.arrayinput(N,arr,sc);
	 System.out.println("the largest elementt is : "+th.largestElement(arr));


	}
}
*/
/*
//Q.4) product of an array element 
import java.util.*;
class four{
   
	void productofarray(int N,Scanner sc){
	
		for(int i=1;i<=N;i++){
		        System.out.println("Enter the length of array for test case "+ i );
                        int N1=sc.nextInt();
			int arr[]=new int[N1];

			System.out.println("Enter the element of array");
			int product=1;
			for(int j=0;j<N1;j++){
		          
			   arr[j]=sc.nextInt();	
				
			}
			for(int j=0;j<N1;j++){
			
				product=product*arr[j];

			}
			System.out.println("The product is "+product);
			

			
		}
	
	}

	public static void main(String[]args ){
	
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the test cases ");
		int N=sc.nextInt();
		four f=new four();
		f.productofarray(N,sc);

	
	}
}
*/

// Q.5) convert the given numbers zeros in to 5
/*
import java.util.*; 
class five{
	int convert0to5(int N){
	
		if(N==0){
		
			return 5;
		}
		int result =0;
		int mul=1;

		while(N>0){
		
			int digit=N%10;
			if(digit==0){
			
				digit=5;
			}
			result=result+digit*mul;
			mul=mul*10;
			N=N/10;

		}

		return result;

	}

	public static void main(String[]args){
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the number");
	 int N=sc.nextInt();
	 System.out.println("You entered "+N);
	 one obj=new one();
          int result=obj.convert0to5(N);
	  System.out.println("the number is :"+result);
	
	}
}
*/

//Q.6  given an array[] containing positive elements .A and /b are two numbers  defining  a range . the task is  to check  if the array  contains all element s in the iven  range  in 
//T.C:=O(N^2)
/*
import java.io.*;

class two{
       
        static boolean checktheelement(int arr[],int start,int end,int N){
		
	
		for(int i=start;i<=end;i++){
		        boolean T=false;
			for(int j=0;j<N;j++){
			
				if(i==arr[j]){
				
					T=true;
					break;

				}
	

			}
	                if(!T){

                                 return false;
                       }

		}
		return true;

	}
 


	public static void main(String[]args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the length of array :");
       
	int N=Integer.parseInt(br.readLine());
        int arr[]=new int[N];

	System.out.println("Enter the start range of  :");
	int start=Integer.parseInt(br.readLine());
        
	System.out.println("Enter the end range of  :");
	int end=Integer.parseInt(br.readLine());
        System.out.println("Enter the element of array");
	for(int i=0;i<N;i++){
	   arr[i]=Integer.parseInt(br.readLine());
		
	}
	for(int i=0;i<N;i++){
	
		System.out.print(arr[i]+"  ");
	}
        boolean result=checktheelement(arr,start,end,N);
	System.out.println();
        if(result){
	
		System.out.println("yes");
	}else{
	
		System.out.println("No");
	}
	}
}
*/
/*
import java.io.*;
// T.C=O(N)
class two2{

        static boolean checktheelement(int arr[],int start,int end,int N){

		for(int i=0;i<N;i++){
		        int temp=arr[i];
			if(arr[i]<0){
			
		
                                  temp=(-1)*temp;


			}
			if(temp>=start&&temp<=end){
			
				int index=temp-start;
				arr[index]=-Math.abs(arr[index]);

			}
		}

		for(int i = start;i<=end;i++){
		
			int index=i-start;
			if(arr[index]>0){
			
				return false;
			}


		}

                return true;

        }

        public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of array :");

        int N=Integer.parseInt(br.readLine());
        int arr[]=new int[N];

        System.out.println("Enter the start range of  :");
        int start=Integer.parseInt(br.readLine());

        System.out.println("Enter the end range of  :");
        int end=Integer.parseInt(br.readLine());
        System.out.println("Enter the element of array");
        for(int i=0;i<N;i++){
           arr[i]=Integer.parseInt(br.readLine());

        }
        for(int i=0;i<N;i++){

                System.out.print(arr[i]+"  ");
        }
        boolean result=checktheelement(arr,start,end,N);
        System.out.println();
        if(result){

                System.out.println("yes");
        }else{

                System.out.println("No");
        }
        }
}

*/
/*
//Q.7) given an array of numbers  from 0 to 9 of size N . your task is  to rearrange  elements of the array  such that  after combining  all the element s of he array the nuber formed is maximum 
import java.io.*;
class seven{
	static int MaxNumber(int arr[],int N){
	int arr2[]=new int[10];
	

	
		
               for(int i:arr){
	    
		    arr2[i]++;

	    }
		System.out.println("frequency array");
		for(int i=0;i<10;i++){
		
			System.out.println(arr2[i]);
		}
		System.out.println("******************");
                int N1=0;int count=0;
		for(int i=9;i>=0;i--){
		
			while(arr2[i]>0){
			      
				N1=N1*10+i;
				arr2[i]--;
				count++;


			
			}
		}
		System.out.println("total loops "+count );
		System.out.println("******************************");
		return N1;
	


	}

	public static void main(String[]args )throws IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());

		int arr[]=new int[N];
		System.out.println("Enter the array elements ");
		for(int i=0;i<N;i++){
		
			arr[i]=Integer.parseInt(br.readLine());
		}
		int result=MaxNumber(arr,N);
                 System.out.println("largets number is "+ result);

	}
}
*/
/*

//Q8) Even occuring elements
//given an array of size N integers that contains  an odd number of occurance for all number except for a few element which are present even number of times//find the elements which have even occurance  in the array. having t.c:O(N), and S.C:O(1).
import java.util.*;
class eight{

	static int evenoc(int arr[],int N){
	
		int max;
		max=Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
		
			
			if(max<arr[i]){
			
				max=arr[i];
			}
		
		}
		max=max+1;
		int arr2[]=new int[max];
		System.out.println("arra2 after initialization ");
		for(int i=0;i<max;i++){
		
			System.out.print(arr2[i]+" ");
		}
                for(int i:arr){
		
			arr2[i]++;
		}
                System.out.println("\nAfter adding frequency ");
	       
 

                for(int i=0;i<max;i++){
			System.out.print(arr2[i]+" ");
		}
	
               System.out.println("\nValue");

		int count=0;
	        for(int i=0;i<max;i++){
		
			if(arr2[i]!=0 && arr2[i]%2==0){
			         count++;
				System.out.print( i+" ");
			}
		}
		System.out.println();
		return count;
	}
	public static void main(String[]args ){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
                int N=sc.nextInt();
		int arr[]=new int [N];
		
		for(int i=0;i<N;i++){
		
			arr[i]=sc.nextInt();
		}
		System.out.println("********************");

	        for(int i=0;i<N;i++){
		
			System.out.print(arr[i]+"  ");
		}
	        int result=evenoc(arr,N);
                if(result==0){
		
			System.out.println(-1);
		}
	

	}
}
*/
/*
//Q 9.) remove an element at specific index from an array 
import java.util.*;
class nine{

	static  void printarray(int arr[]){
	
		for(int i=0;i<arr.length;i++){

                        System.out.print(arr[i]+"  ");
                }

	}
	static int[] removeElement(int arr[],int N,int index){
	
		int newarr[]=new int[N-1];
		for(int i=0,j=0;j<N-1;i++){
		
			if(i!=index){
			
				newarr[j]=arr[i];
				j++;

			}
		}
		return newarr;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int N=sc.nextInt();
		int arr[]=new int [N];
		System.out.println("Enter the element in the array");
		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(" print the array ");
		printarray(arr);
		System.out.println("\nEnter the index you want to remove ");
		int index=sc.nextInt();
		int [] result=removeElement(arr,N,index);
		//printarray(result);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+"  ");
		}		
	}
}
*/

//Q.10)Max odd sum,Given an array of integers ,check  whether there is a subsequence  with odd  sum and  if yes then find the maximum odd sum .if no subsequence  contains an odd sum, print -1,
//having time complexity o(N)  and space complexityO(1) 
//arr[]={2,5,-4,3,-1}
//outpout is: 9
//explanation : the subsequence with maximum odd
//sum is 2+5+3+(-1)=9
/*
import java.util.*;
class ten{

	static int maxoddsum(int arr[]){
	
		int totalsum=0;
		int smallestodd=Integer.MAX_VALUE;
		boolean hasodd=false;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>0){
			totalsum+=arr[i];
		    }
		    if(arr[i]%2!=0){
		         hasodd=true;
			 smallestodd = Math.min(smallestodd, Math.abs(arr[i]));
		    }
		}
		if(totalsum%2!=0){
		
		return totalsum;
		}
		
		if(hasodd){
	
			return totalsum-smallestodd;

		}
		return -1;
	}
	public static void main(String[]args){
	
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of the array");
                int N=sc.nextInt();
                int arr[]=new int [N];
                System.out.println("Enter the element in the array");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Print the element of the array");
		for(int i=0;i<N;i++){
		
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
                int result=maxoddsum(arr);
		if(result!=-1){
		
			System.out.println("MaxoddSumis:-" +result);
		}else{
		
			System.out.println(result);
		}
	
	}
} 
*/
//Q.11) product of maximum in first array and minimum of second array
//Given two array of  A and B havin size N1 and N2 the task is  to calculate the product of the maximum  element of the first and 
//minimul element of second array 
// having time complexity O(N+M)
//  and  Auxillary Space O(1)
/*
import java.util.*;
class eleven{

	static int fun(int arr1[],int arr2[],int N1,int N2){
	
		int MaxE=Integer.MIN_VALUE;
		int MinE=Integer.MAX_VALUE;

		for(int i=0;i<arr1.length;i++){
		
			if(arr1[i]>MaxE){
			
				MaxE=arr1[i];
  
			}
                        
		}
		System.out.println("Maximum Element is :- "+MaxE);
	        for(int i=0;i<arr2.length;i++){

                        if(arr2[i]<MinE){

                                MinE=arr2[i];

                        }

                }
		
		System.out.println("Maximum Element is :- "+MinE);
	        
		return (MinE*MaxE);
	
	}
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		//int N1=sc.nextInt();
		System.out.println("enter the length of first array");
	
		
                int N1=sc.nextInt();
		int arr1[]=new int[N1];
		System.out.println("Enter the element in the array ");
		for(int i=0;i<N1;i++){
		
			arr1[i]=sc.nextInt();

		}
		System.out.println("enter the length of second array");
		
                int N2=sc.nextInt();
		int arr2[]=new int[N2];
               System.out.println("Enter the element in the array ");
                for(int i=0;i<N2;i++){
                        arr2[i]=sc.nextInt();
                }
		int result=fun(arr1,arr2,N1,N2);
                System.out.println("product is "+result);
	}
} 
*/
// Q.12)first and last occurance of X
// given an sorted array having N element , find  the indices  of the first  and last occurance  of an element X in the given  array
// if  X isnt found return -1
// havin  T.C: O(log(N)) and O(1)
/*
import java.util.*;
class twelve{
	  static boolean occurrance(int arr[],int N,int key){
		  int firstocc=-1;int lastocc=-1;
		  int start=0;int end=N-1;
		  boolean occure=false;
		  while (start<=end){
			  int mid=start+(end-start)/2;
			  if(key==arr[mid]){
				  occure=true;
				  firstocc=mid;lastocc=mid;
                                   int val=mid-1;
				  while(val>=0){
					  if(arr[val]!=key){
						  break;
					  }
					  firstocc=val;
					  val--;
				  }
				  int val2=mid+1;
				  while(val2<N){
					  if(arr[val2]!=key){
					    break;
					  }
					  lastocc=val2;val2++;
				  }
			      System.out.println("First Occurrance of  "+key+" is :- "+firstocc);
			      System.out.println("last Occurrance of  "+key+" is :- "+lastocc);
                             break;
			   }else if(key<arr[mid]){
			   
				   end=mid-1;


			   }else{
			   
				   start=mid+1;
			   }

		  }
		  return occure;
	  }
	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int N=sc.nextInt();
		int arr[]=new int[N];
		System.out.println("Enter the element in the array in sorted way ");
		for(int i=0;i<N;i++){
		
			arr[i]=sc.nextInt();

		}
		System.out.println("enter the key value u want to occurance ");
		int key=sc.nextInt();
		
		boolean result = occurrance(arr,N,key);
		if(!result){
		
                	System.out.println(" -1");
		}
	}
}
*/

///Q.13) find a unoqe element
// Given an array  of size n which contains all elements occuring in multiples  of k ,                                                                      // except one element which dosent  occur in multiple  of K find that unique  elemnt
// havin time complexity O(N.log(A[i]))
// and space complexity O(log(A[i]))
/*
import java.util.*;
class thirteen{

	static int findUniqueEement(int arr[],int N,int key){
	
		int result=0;
		for(int bit=0;bit<32;bit++){
		
			int bitsum=0;
			for(int i=0;i<N;i++){
			
				if((arr[i]&(1<<bit))!=0){
				
					bitsum++;
				}
			
                      }
		      if(bitsum%key!=0){
		      
			      result=result|(1<<bit);
		      }
		
		}
		return result;

	
	}
	static int[] getarrayElement(int N,Scanner sc){
	
		int arr[]=new int[N];
		System.out.println("Enter the element in the array  :- ");
		for(int i=0;i<N;i++){
		
			arr[i]=sc.nextInt();

		}
		return  arr;

	}
	static void printArrayElement(int N,int[]arr){
	
		System.out.println("print the array");
		for(int i=0;i<N;i++){
		
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[]args){
	        Scanner sc=new Scanner(System.in);
                System.out.println("Enter the length of array");
                int N=sc.nextInt();
		//int arr[]=new int[N];
	        int arr[] = getarrayElement(N,sc);
		printArrayElement(N,arr);
		System.out.println("Enter the key ");
		int key=sc.nextInt();
                System.out.println("Unique Element in the array is:- "+findUniqueEement(arr,N,key));

	}

}
*/

/*
 Q.14) Maximum Repeating number 
 Given an array of size N the array containe the numbers in range of 0 to k-1  where k is a positive  integer and K<=N find the mximum repeating number in this array if there are  two or more  mximum repeating number return the element  having  least value 
 Time complexity is O(N)
 Auxillary Space complexity is O(K)
*/
/*
import java.io.*;
class fourteen{
        static int[] getarrayElement(int N,BufferedReader br,int K)throws IOException{

                int arr[]=new int[N];
                System.out.println("Enter the element in the array in range of 0  to "+ (K-1));
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());

                }
                return  arr;

        }
        static void printArrayElement(int N,int[]arr){

                System.out.println("print the array");
                for(int i=0;i<N;i++){

                        System.out.print(arr[i]+"  ");
                }
                System.out.println();
        }
	static int findmaximumelement(int [] arr,int K,int N){
	
		int []freq=new int[K];
		for(int i=0;i<N;i++){
			freq[arr[i]]++;
		}
                int maxFreq=0;
		int minValue=Integer.MAX_VALUE;

		for(int i=0;i<K;i++ ){
		
			if(freq[i]>maxFreq){
			
				maxFreq=freq[i];
				minValue=i;
			}else if(freq[i]==maxFreq){
			
				minValue=Math.min(i,minValue);
			
			}
		}
		return minValue;
	
	}
	public static void main(String[]args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of array ");
		int N=Integer.parseInt(br.readLine());
		System.out.println("Enter the range of numbers in array (K)");
		int K=Integer.parseInt(br.readLine());
                int arr[]=getarrayElement(N,br,K);
                printArrayElement(N,arr);
		System.out.println();
		System.out.println("maximum repeating number having least value:- "+findmaximumelement(arr,K,N));
	
	}
}
 */
/*
 Q.15) find the sum of distinct element in the array of size N
 having time complexity is :- O(N*log(N))
 and space complexity is :-O(N*log(N))
 */
/*

class fifteen{
        void merge2array(int arr[],int start,int mid,int end){
                int n1=mid-start+1;int n2=end-mid;
                int arr1[]=new int[n1];int arr2[]=new int[n2];
                for(int i=0;i<n1;i++){
                        arr1[i]=arr[start+i];
                }
                for(int j=0;j<n2;j++){
                        arr2[j]=arr[mid+1+j];
                }
                int i=0,j=0,k=start;
                while(i<arr1.length&&j<arr2.length){
                        if(arr1[i]<arr2[j]){
                                arr[k]=arr1[i];
                                i++;
                        }else{
                                arr[k]=arr2[j];

                                j++;
                        }
                        k++;
                }
                while(i<arr1.length){
                        arr[k]=arr1[i];
                        i++;k++;
                }
                while(j<arr2.length){
                        arr[k]=arr2[j];
                        j++;k++;
                }
        }
            void mergeSortmethod(int arr[],int start,int end){
                if(start<end){
                        int mid=(start+end)/2;
                        mergeSortmethod(arr,start,mid);
                        mergeSortmethod(arr,mid+1,end);
                        merge2array(arr,start,mid,end);
                }
        }
	int sumofdistinct(int arr[]){
	        ;int sum=0;
		for(int i=0;i<arr.length;i++){
			if(i==0 || arr[i]!=arr[i-1]){
		
				sum=sum+arr[i];
			}
		
		}
		return sum;
	}
        public static void main(String[]args){
                int arr[]=new int[]{9,1,8,2,7,3,6,4};
                int start =0; int end=arr.length-1;
                fifteen obj=new fifteen();
                obj.mergeSortmethod(arr,start,end);
                for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+"  ");
                }
		System.out.println();
                System.out.println(obj.sumofdistinct(arr));
        }
}
*/

