//Quetion )    Given an array of size N .find out the total number of subarray  possible.
/*

class Subarray{

	public static void main(String[]args ){
	         int count =0;

		int arr[]=new int []{4,2,10,3,12,-2,15};
		for(int i=0;i<arr.length;i++){
		
		
			for(int j=i;j<arr.length;j++){
			
				count++;
			
			}
		
		}
	System.out.println(count);
	}

}

*/
/*
class Subarray{

        public static void main(String[]args ){
                 int count =0;

                int arr[]=new int []{4,2,10,3,12,-2,15};
                int N=arr.length;
		System.out.println(((N*(N+1))/2));

}
}
*/
/*
//Q1)  Given an array size N , print all the element in a given array subarray from start to end 
class Subarray{

	public static void main(String[]args ){
	int arr[]=new int []{-2,1,-3,4,-1,2,1,-5,4};
	int start=3;int end=7;
	for(int i=start;i<=end;i++){
	
		System.out.print(arr[i]+" ");
	
	}
	System.out.println();
	
	
	
	}

}

*/

/*
//Q2)   given an array of size N print all the subarray  
class allSubArray{

	public static void main(String[]args){
	
		int arr[]=new int []{2,4,1,3};
		int N=arr.length;
		for(int i=0;i<N;i++){
		
			for (int j=i;j<N;j++){
			   
				for(int k=i;k<=j;k++){
				
					System.out.print(arr[k]+" ");
				
				}
                             System.out.println();
			
			}
		
		}
	
	
	}
}

*/

//Q)  given an array of size N, A) print the sum of every  single subarray  B)print the sum of every single subarray using prefix sum  C) print the sum of
//every subarray with time complexity O(N) and without extra space complexity (carryforward approach);
/*
class addAllSubArray{

	public static void main(String[]args ){
	
		int arr[]=new int []{2,4,1,3};

		for(int i=0;i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
			
				int sum=0;
				for(int k=i;k<=j;k++){
				
					sum=sum+arr[k];
				
				}
				System.out.println(sum);
				System.out.println();
			
			
			
			}
		
		
		
		}
	

	
	}


}

*/
/*
class addAllSubArray{

        public static void main(String[]args ){

                int arr[]=new int []{2,4,1,3};

               int pSum[]=new int [arr.length];
	       pSum[0]=arr[0];

	       for(int i=1;i<arr.length;i++){
	       
		       pSum[i]=pSum[i-1]+arr[i];

	       
	       }
	       for(int i=0;i<pSum.length;i++){
	       
		       System.out.print(pSum[i]+"  ");

	       }
                
	       for(int i=0;i<pSum.length;i++){
	       
		       for(int j=i;j<pSum.length;j++){

		       int sum=0;
			       if(i==0){
			       
				       sum=pSum[j];
			       
			       }else{
			       
				       sum=pSum[j]-pSum[i-1];
			       
			       }
			       System.out.println(sum);
			       
		       
		       
		       
		       }
	       
	       }


        }


}


*/
/*
//carryforword Approach 
class addAllSubArray{

        public static void main(String[]args ){

                int arr[]=new int []{2,4,1,3};
                for(int i=1;i<arr.length;i++){
		
			arr[i]=arr[i-1]+arr[i];

	
		}
		for(int i=0;i<arr.length;i++){
		
		
			System.out.print(arr[i]+"  ");

		
		}
                System.out.println();
		for(int i=0;i<arr.length;i++){
		
		
			for(int j=i;j<arr.length;j++){
			
				int sum=0;

				if(i==0){
				
					sum=arr[j];

				}else{
				
					sum=arr[j]-arr[i-1];
				
				}
				System.out.print(sum+"  ");			
			}
		}              
        }
}
*/


//Q4)  Given an array of size N find the total sum of alll subarray sum


class addAllSubArray{

        public static void main(String[]args ){

                int arr[]=new int []{2,4,1,3};
                for(int i=1;i<arr.length;i++){

                        arr[i]=arr[i-1]+arr[i];


                }
                for(int i=0;i<arr.length;i++){


                        System.out.print(arr[i]+"  ");


                }
                System.out.println();
		int totalSum=0;
                for(int i=0;i<arr.length;i++){


                        for(int j=i;j<arr.length;j++){

                                int sum=0;

                                if(i==0){

                                         sum=arr[j];
					 totalSum=totalSum+sum;
 
                                }else{

                                        sum=arr[j]-arr[i-1];
                                        totalSum=totalSum+sum;
                                }
                                
                        }
                } System.out.println(totalSum);
        }
}
























