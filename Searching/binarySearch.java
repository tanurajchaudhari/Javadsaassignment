/*
import  java.util.*;
class BinarySearch{

	static int count=0;
	int binarySearch(int  arr[],int search){
	
		int start=0;
		int end =arr.length-1;
		while(start<=end){
		
			count++;
			int mid=(start+end)/2;
			if(arr[mid]==search){
			
				return mid;
			
			}
			if(arr[mid]<search){
			
				start=mid+1;
			}
			if(arr[mid]>search){
			
				end=mid-1;
			}
		
		}
		return -1;
	
	}
	public static void main(String[]args){
	
		int arr[]=new int []{4,7,11,24,35,57,75,87};
		Scanner sc= new Scanner(System.in);
		int search=sc.nextInt();
		BinarySearch obj=new BinarySearch();
		int index=obj.binarySearch(arr,search);
		System.out.println(count);
		if(index==-1){
		
			System.out.println("Not found");
		}else{
		
			System.out.println(" found At :- "+index);
		}
	
	
	}

}
*/

//recursion on binary search 
/*
import  java.util.*;

class BinarySearchRecursion{

	
	int binarySearchR(int arr[],int start,int end,int search){
	
		if(start>end){
		
			return -1;

		}else{
		
			int mid =start+end/2;
			if(arr[mid]==search){
			
				return mid;
			}
			if(arr[mid]>search){
			
				return binarySearchR(arr,start,mid-1,search);
			}else{
			
				return binarySearchR(arr,mid+1,end,search);
			}
		}

	}
	public static void main(String[]args){
	
		int arr[]=new int []{4,7,11,24,35,57,75,87};
		Scanner sc=new Scanner(System.in);
                int search= sc.nextInt();
		BinarySearchRecursion obj=new BinarySearchRecursion();
                int retval=obj.binarySearchR(arr,0,arr.length-1,search);
	
		if(retval==-1){
		
			System.out.println("Not found");

		}else{
		
			System.out.println("Found at index :- "+retval);
		}
	}
}
*/

