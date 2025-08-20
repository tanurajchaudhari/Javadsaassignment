//Q.28) Remove Duplicate from unsorted Array
//Given an array of integers which may or may not contain duplicate elements, Your task is to remove dupicate  elements , if presents 
//time complexity :O(N)
//space complexity : O(N)
//
/*
import java.io.*;
import java.util.*;
class twentyEight{

	static void getElement(int N, int arr[],BufferedReader br)throws IOException{
	
		System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){
		
			arr[i]=Integer.parseInt(br.readLine());
		}
	}
	static void printElement(int N,int arr[]){
	
		System.out.println("Printing the Element of Array");
		for(int num : arr){
		
			System.out.print(num+"  ");

		}
		System.out.println();

	}
	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of array :- ");
		int N=Integer.parseInt(br.readLine());
		int Arr[]=new int[N];
		getElement(N,Arr,br);
		printElement(N,Arr);
                HashSet<Integer> hs=new HashSet<>();
                for(int num :Arr){
		
			if(!hs.contains(num)){
			
				hs.add(num);
				System.out.print(num+"  ");

			}

		}
		System.out.println();
	}
}
*/

//Q.29) Last index of One
//Given a string S consisting only of '0's and '1's, find thelast index of the '1's present  in it
/*
import java.io.*;
class twentyNine{

	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string contains only 0s and 1s ");
		String s=br.readLine();
		int lastIndex=-1;

		for(int i=s.length()-1;i>=0;i--){
		
			if(s.charAt(i)=='1'){
			
				lastIndex=i;
				break;

			}
		}
		System.out.println("The last index of 1's is "+lastIndex);
	}
}
*/


//Q.30) Find the closest number 
//Given an array of sorted integer.The task is to find the closest value to the given number in the array. Array may contain duplicate value
//Note: if the difference is same for two values orint the value which is greater than the given number.
//time complexity: O(log(N))
//space complexity :O(1)
//
/*
import java.io.*;
import java.util.*;
class Thirty{

        static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
        static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
        public static void main(String[]args)throws IOException{

                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
                System.out.println("Enter the  number to find the closest  ");
		int x=Integer.parseInt(br.readLine());

		if(x<=Arr[0]){
		
			System.out.println("Closest number is :-  "+Arr[0]);
			return;
			
	        }
		if(x>=Arr[N-1]){
		
			System.out.println("Closest number is :- "+Arr[N-1]);
			return;
		}

		int low=0;int high=N-1;
		while(low<=high){
		
			int mid=low+(high-low)/2;
			if(x==Arr[mid]){
			
				System.out.println("Closest number is :-"+ Arr[mid]);
				return;
			}
			if(x>Arr[mid] && x<Arr[mid+1]){
			
				if(x-Arr[mid] == Arr[mid+1]-x){
				
					System.out.println("Closest number is :-"+ Arr[mid+1]);
					return;
				}
				if(x-Arr[mid]<Arr[mid+1]-x){
				
					System.out.println("Closest number is :-"+ Arr[mid]);
					return;
				}else{
				
					System.out.println("Closest number is :-"+ Arr[mid+1]);
					return;
				}
			}
			if(x<Arr[mid]){
			
				high=mid-1;
			}else{
			
				low=mid+1;
			}
		} 
		System.out.println("-1");
	}
}
*/

//Q.31) Sum of (a[i],a[j]) over all pairs in an array of n integers
//Given an array A of n integers,find the sum of f(a[i],a[j]) of all pairs (i,j) such that (1<=i<j<=n).
//f(a[i],a[j]) : if abs(a[j]-a[i])>1
//                 f(a[i],a[j])=a[j]-a[i]
//                 else if abs(a[j]-a[i])<=1
//                 f(a[i],a[j])=0
//
//Example 1: 
//        input: arr[]={1,2,3,1,3};
//        output:4
//        Explaination: All pairs are: (3-1)+(1-3)+(3-1)+(3-1)=4
//        (1-2),(3-2),(1-1),(2-1),(3-3),(3-2) these pairs will give zero as their absolute difference is <=1
//
//time complexity:O(N)
//expected Auxiallary space :O(N)
/* 
import java.io.*;
import java .util.*;
class thirtyOne{
        static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
        static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
        static int totalSum(int N,int arr[]){
	        //count the contribution of value at position j
		int totalSum=0;
		for(int j=0;j<N;j++){
			totalSum +=arr[j]*(2*j-N+1);
		}
		return totalSum;
	}
	static int subOfAAndB(int N,int arr[]){
	
		int A_Total=0;int B_Total=0;
		HashMap<Integer,Integer>freq=new HashMap<>();
		for(int j=0;j<N;j++){
		
			int x=arr[j];
			if(freq.containsKey(x-1)){
			
				A_Total +=freq.get(x-1);
			}
			if(freq.containsKey(x+1)){
			
				B_Total +=freq.get(x+1);
			}
			freq.put(x, freq.getOrDefault(x, 0) + 1);
		}
		return A_Total - B_Total;

	}
	public static void main(String[]args)throws IOException{
	
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
		int result=totalSum(N,Arr)-subOfAAndB(N,Arr);
		System.out.println("The sum is :- "+result);

	}
}
*/


//Q.32)Maximum sum(arr[i]*i) of an array 
// Given an array A of N integers your task is to write a program to find the maximum value of Summetion of arr[i]* i , where i=0,1,2,n-1.
// you are allowed to rearrange the element of the array.
// note: Since output could be large , hence module 109+7 and then print answer.
// exampe 1:
//      input: Arr[]={5,3,2,4,1}
//      output:40
//      explaination: if we arrange the array as  1,2,3,4,5 then we can see that the minimum index will multiplay with minimum number
//      and maximum index will multiply with maximum number.
//      so 1*0+2*1+3*2+4*3+5*4 =0+2+6+12+20=40 mod(109+7)=40 
//expected time complexity:O(Nlog(N));
//expected Auxillary Space : O(1);
//constraints: 1 <= N<=10^7
//             1<=A[i]<=N;
//
/*
import java.util.*;
import java .io.*;
class thirtyTwo {
    static final int MOD = 1000000007;  
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
    
    public static void main(String[] args)throws IOException {
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);   
                System.out.println("THe sum of maximim multiplication :- "+maxSum(Arr));
    }
    
    static long maxSum(int[] arr) {
        
        Arrays.sort(arr);
        
        long result = 0;
        
        // Step 2: Compute sum of arr[i] * i
        for (int i = 0; i < arr.length; i++) {
            long term = ((long)arr[i] * i) % MOD; // prevent overflow
            result = (result + term) % MOD;       // add safely with modulo
        }
        return result;
    }
}
*/

//Q.33)Multiply left and right  array sum
//pitsy need hel with the given task by her teacher. The task is to divide an array into two sub -array (left and right ) containing n?2 elements
// ach  and do the sum of the subarrays  and then  multiply both the subarrays
// Note: if the length of the array is odd then the right half will contains  one elemnt more than  the left  half .
//Expected Time Complexity: O(N).
//expected  Auxillary Space :O(1).
//
/*
import java .io.*;
class thirtyThree {
    
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
     static int sumOFSA(int start,int end,int arr[]){
             int sum=0;
	     for(int i=start;i<end;i++){
	     
		     sum +=arr[i];

	     }
	     return sum;
     }

    public static void main(String[] args)throws IOException {
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
                int mid = N/2;
                System.out.println("multiplication of sum of subarray : -  "+ sumOFSA(0,mid,Arr) * sumOFSA(mid,N,Arr));

 
    }
}
*/

//Q.34) print an array in pendulum Arrangement
//Given an array  ar of size n . arrange the element of the array in a way similar to the too and fro movement of s pendulum .
//The minimum element out of the list of integers ust cme in the center position  of the array , if there are even  elments, then minimum element should be moved to  (n-1)/2 index (considering that indexes start from 0) 
//The next number goes to the left of the minimum number and it continues like a pendulum 
//As higher number are reaches, one goes to one side  in a to - and - fro manner similar to that  of a pendulum.
/*
import java .util.*;
import java .io.*;
class thirtyFour{
    static final int MOD = 1000000007;
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
         public static void main(String[] args)throws IOException {
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
                Arrays.sort(Arr);
		int center;
                int Arr2[]=new int[N];
		if(N%2==0){
		
			center=(N-1)/2;
		}else{
		
			center=N/2;

		}
		for(int i=0;i<N;i++){
		
			if(i==0){
			
				Arr2[center]=Arr[i];

			}else if(i%2==1){
			
				center=center+i;
				Arr2[center]=Arr[i];
			}else{
			
				center=center-i;
                                Arr2[center]=Arr[i];
			}
			
		}
		printElement(N,Arr2);
    }
}
*/

//Q.35)Minimum product of K integers
//given  an array of N positive integers .You need write a program to print the minimum product of K integers of the given array.
//Note since output could be large , hence module 10^9+7 and then print answer.
//time complexity :O(nlogn)
//space complexity : O(1)
/*
import java .util.*;
import java .io.*;
class thirtyFive{
    static final int MOD = 1000000007;
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
         public static void main(String[] args)throws IOException {
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
                System.out.println("Enter the number of element you a want product :- ");
		int K=Integer.parseInt(br.readLine());
                int mul=1;
		Arrays.sort(Arr);
		for(int i=0;i<K;i++){
		
			mul = (mul*Arr[i])%MOD;
		}
		System.out.println("Product of k smallest element in the array :- "+mul);
	 }
}
*/

//Q.36)find the peak  element which is not smaller than its neighbors
//Given  an array of n elements that is first  strictly increasing and then maybe strictly decreasing fond the maximum elemnet in the array 
//note:- if the array is increasing  then just print te last element will be the maximum value.
//
//
/*
import java .util.*;
import java .io.*;
class thirtySix{
    
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
         public static void main(String[] args)throws IOException {
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
                int maxE=-1;
		boolean flag=false;
		for(int i=0;i<N;i++){
		
			if(i==0){
			
				maxE=Arr[i];
			}else if(i==N-1 && flag==false){
				
			      if(maxE>Arr[i]){
			      
				      System.out.println(maxE);
			      }else{
			      
				      System.out.println(Arr[i]);
			      }
			
			}else{
			
				if(Arr[i]>Arr[i-1] && Arr[i]>Arr[i+1]){
				
					flag=true;
					System.out.print(Arr[i]+" , ");
				}
			}
		}
		System.out.println();
	 }
}
*/

//Q.37)Move the all negative numbers to beginning  and dpositive to end with constant extra space 
//An array contains both positive and negative numbers in random order.Rearrange the array element  so that all negative numbers appear 
//before all positive numbers.
//example :
// input:-  -12,11,-13,-5,6,-7,5,-3,-6
// Output:-  -12,-13,-5,-7,-3,-6,11,6,5
/*
import java .util.*;
import java .io.*;
class thirtySeven{

    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
         public static void main(String[] args)throws IOException {
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array :- ");
                int N=Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
                int j=0;
                for(int i=0;i<N;i++){
	       
			if(Arr[i]<0){
			
				int temp=Arr[i];
				Arr[i]=Arr[j];
				Arr[j]=temp;

				j++;

			}
	        }
		printElement(N,Arr);


	 }
}
*/
/*
import java.util.*;
class MoveNegatives {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void rearrange(int[] arr) {
        int j = 0; // boundary for negatives

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++; // move boundary
            }
        }
    }
}
*/

//Q.38) Immediate Smaller Element 
//Given  an integer array Arr of Size N for each element in the array , check whether the right adjacent lement (on the next immdediate  position )
//of the array is smaller. if te next  element is smaller,update the current index to that element  if not then -1.
//
/*
import java.io.*;
class thirtyEight{
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
	public static void main(String[]args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the length of the array :- ");
		int N= Integer.parseInt(br.readLine());
		int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
		for (int i=0;i<N;i++){
		
			if(i==N-1){
			
				Arr[i]=-1;
			}else{
			
				if(Arr[i+1]<Arr[i]){
				
					Arr[i]=Arr[i+1];

				}else{
				
					Arr[i]=-1;
				}
			}
		}
		printElement(N,Arr);
	}
}
*/

//Q.39) Leaders in an array 
//Write a program   to print all the LEADERS in the array . An element is a leader if it is greater than all the element to its right side .
//And the rightmost element is always a leader.
//
/*
import java.io.*;
class thirtyNine{
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the length of the array :- ");
                int N= Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
                for(int i=0;i<N;i++){
		
			if(i==0 ){
			
				if(Arr[i]>Arr[i+1]){
				     System.out.print(Arr[i]+"  ");
				}
			
			}else if(i==N-1){
			
				System.out.print(Arr[i]+"  ");
			}else {
		        	if(Arr[i]>=Arr[i-1] && Arr[i]>Arr[i+1]){
			 
			        	System.out.print(Arr[i]+"  ");
			        }
		    }
		}
		System.out.println();
	}
}
*/

//Q.40) Fibonacci in the array 
// given an array of size N , the task is to count the number of element of the array which are fibancci number 
// time complexity : O(N)
// space complexity : O(1)
// example 1:
// input: N=9,arr[]={4,2,8,5,20,1,40,13,23}
// output: 5
//
/*
import java.util.HashSet;
import java.util.Set;
import java.io.*;

class fourty {
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
    public static void main(String[] args)throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the length of the array :- ");
                int N= Integer.parseInt(br.readLine());
                int Arr[]=new int[N];
                getElement(N,Arr,br);
                printElement(N,Arr);
	 
                System.out.println(countFibonacciNumbers(Arr, N));
    }

    public static int countFibonacciNumbers(int[] arr, int n) {
        Set<Long> fibSet = generateFibonacciSet(1000000000L);
        int count = 0;
        for (int num : arr) {
            if (fibSet.contains((long) num)) {
                count++;
            }
        }
        return count;
    }

    private static Set<Long> generateFibonacciSet(long max) {
        Set<Long> fibSet = new HashSet<>();
        long a = 0;
        long b = 1;
        fibSet.add(a);
        fibSet.add(b);
        while (a + b <= max) {
            long c = a + b;
            fibSet.add(c);
            a = b;
            b = c;
        }
        return fibSet;
    }
}
*/

//Q.41) Countries at war
// the two countrie of A and B  are at war against each other.Both countries have N number of soldiers . the power of these soldiers are given by A[i]...
// A[N] and B[i]...B[N]
//  these soldiers have peculiarity . they can only attack their  counterpart enemies ,like A[i] can attack only B[i]  and not  anyone else A soldier  with higher power can kill the enemy soldier . if both have the same power , they both die  .You need to find ye winning country
// time complexity : O(N)
// space complexity : O(1)
// constraints :
//   1<=N<=10^5
//   0<=Ai<=10^7
//   0<=Bi<=10^7
/*
import java.io.*;
class fourtyOne{
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
     static String winningCountry(int A[],int B[],int N){
	     int count_A=0;int count_B=0;
	     for(int i=0;i<N;i++){
	     
		     if(A[i]>B[i]){
		     
			     count_A++;

		     }else if(A[i]<B[i]){
		     
			     count_B++;
		     }

	     }
	     if(count_A > count_B){
	     
		     return "A";
	     }else if(count_B > count_A){
	     
		     return "B";
	     }else{
	     
		     return "Tie";
	     }

     }
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the length of the array :- ");
                int N= Integer.parseInt(br.readLine());
                int A[]=new int[N];
		int B[]=new int [N];
		System.out.println("Enter the first  array element ");
                getElement(N,A,br);
                printElement(N,A);
		System.out.println("Enter the second array element ");
                getElement(N,B,br);
                printElement(N,B);

		System.out.println(winningCountry(A,B,N));

	}
}
*/

//Q.42) Count the number of element between twi given elements in an array .Given an unsorted array and two elements num1 and num2
// the task is to count the number of elements  occuring between  the given element (excluding num1 and num 2) if there are multiple occurence of num1 and num2  we need to consider the leftmost  ocurence of num1 and rightmost occurence of num2 
//time complexity:=O(N)
//space complexity:=O(1)
//constrainst
//   2<=N<=10^5
//   1<=A[i],num1,num2<=10^5
//
/*
import java.io.*;
class fourtyTwo{
    static void getElement(int N, int arr[],BufferedReader br)throws IOException{

                System.out.println("Enter the Element in the array :- ");
                for(int i=0;i<N;i++){

                        arr[i]=Integer.parseInt(br.readLine());
                }
        }
     static void printElement(int N,int arr[]){

                System.out.println("Printing the Element of Array");
                for(int num : arr){

                        System.out.print(num+"  ");

                }
                System.out.println();

        }
        public static void main(String[]args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the length of the array :- ");
                int N= Integer.parseInt(br.readLine());
                int A[]=new int[N];
                
                //System.out.println("Enter the first  array element ");
                getElement(N,A,br);
                printElement(N,A);
		System.out.println("Enter the first number :- ");
		int num1=Integer.parseInt(br.readLine());
		System.out.println("Enter the second number :- ");
		int num2=Integer.parseInt(br.readLine());
                int leftIndex=-1;int rightIndex=-1;

		for(int i=0;i<N;i++){
			if(A[i]==num1){
				leftIndex=i;
				break;
			}
		}

		for(int i=N-1;i>=0;i--){
                        if(A[i]==num2){
                                rightIndex=i;
                                break;
                        }
                }

		System.out.println(rightIndex-leftIndex-1);
                
        }
}
*/

