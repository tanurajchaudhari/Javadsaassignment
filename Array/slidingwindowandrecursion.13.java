//Q.1) Given an array of size N find the maximum aubarray sum of length k.
/*
class  MaxsubarraysumlenK{

	public static void main(String[]args){
	
		int arr[]=new int []{-3,4,-2,5,3,-2,5,3,-2,8,2,1,4};

		int  K=4;
		int start=0;int end=K-1;
		int maxVal=Integer.MIN_VALUE;
		while(end<arr.length){
		
			int sum=0;
			for(int i=start;i<=end;i++){
			
			
				sum=sum+arr[i];


			}
			if(sum>maxVal)
				maxVal=sum;

			start++;end++;

		}
		System.out.println(maxVal);

	
	}

}
*/
/*
//by using prefix sum
class Maxsubarraysumlenk{

	public static void main(String[]args){
	
		int arr[]=new int []{-3,4,-2,5,3,-2,5,3,-2,8,2,1,4};
		int psum[]=new int[arr.length];
                psum[0]=arr[0];
		for(int i=1;i<psum.length;i++){
		
			psum[i]=psum[i-1]+arr[i];

		
		}

		for(int i=0;i<psum.length;i++){
		
			System.out.print(psum[i]+"  ");
		
		}
		int k=4;int start=0;int end=k-1;
		int maxVal=Integer.MIN_VALUE;
		while(end<psum.length){
		
			int sum=0;
			if(start==0){
				sum=psum[end];
			}else{
				sum=psum[end]-psum[start-1];


			}
			if(sum>maxVal)
				maxVal=sum;

		
		}
		System.out.println("*****************************************");
	System.out.println(maxVal);

	
	}

}
*/
//Sliding Window   

/*
class slidingWindow{

	public static void main(String[]args){
	
		int arr[]=new int[]{-3,4,-2,5,3,-2,8,2,1,4};
		int maxele=Integer.MIN_VALUE;
		int k=4;int sum=0;
		for(int i=0;i<k;i++){
		
			sum=sum+arr[i];
		
		}
		maxele=sum;
		int start=1;int end=k;
		while(end<arr.length){
		
			sum=sum-arr[start-1]+arr[end];
			if(sum>maxele){
			
				maxele=sum;
			}
			start++;end++;
		
		}
		System.out.println("Maximum sum of sub array is :- "+maxele);


	}


}
*/


