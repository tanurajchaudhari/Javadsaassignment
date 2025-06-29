//Q5  /maximim subarray  sum
//Given an integer array of size  N  find contiguouse subarray containing atleast one number which has the largest sum and return its sum 
/*
class maxSubArraySum{

	public static void main(String[]args ){
	
		int arr[]=new int []{-2,1,-3,4,-1,2,1,-5,4};
		int maxSum=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
		
		
			for(int j=i;j<arr.length;j++){
			
				int sum=0;
				for(int k=i;k<=j;k++){
				
					sum=sum+arr[k];
				
				}
				if(sum>maxSum)
					maxSum=sum;

			
			
			}
		
		} System.out.println(maxSum);
	
	
	
	}


}
*/
//Optimise approach // using carryforeword approach 
/*
class maxSubArraySum{
  
	  public static void main(String[]args ){
	     
		  int maxSum=Integer.MIN_VALUE;
		  int arr[]=new int []{-2,1,-3,4,-1,2,1,-5,4};
                  for(int i=0;i<arr.length;i++){
		  
			  int sum=0;
			  for(int j=i;j<arr.length;j++){
			  
			  
				  sum=sum+arr[j];

				  if(sum>maxSum)
					  maxSum=sum;

			  
			  }
		  

		  }
              System.out.println(maxSum);

                   	  
	  
	  
	  }
  
  
  }
*/

//with prefix sum approach
/*

class maxSubArraySum{

          public static void main(String[]args ){

                  int maxSum=Integer.MIN_VALUE;
                  int arr[]=new int []{-2,1,-3,4,-1,2,1,-5,4};
		  int pSum[]=new int [arr.length];
		  pSum[0]=arr[0];

		  for(int i=1;i<pSum.length;i++){
		  
		  
			  pSum[i]=pSum[i-1]+arr[i];

		  
		  }

                  for(int i=0;i<pSum.length;i++){

                                      
                          System.out.print(pSum[i]+"   ");


                  } System.out.println();

                  for(int i=0;i<pSum.length;i++){

                           int sum=0;
                          for(int j=i;j<pSum.length;j++){


                                  if(i==0){
				  
					  sum=pSum[j];
				  
				  }else {
				  
					  sum=pSum[j]-pSum[i-1];

				  
				  }

                                  if(sum>maxSum)
                                          maxSum=sum;


                          }


                  }
              System.out.println(maxSum);




          }


  }

*/


//Kadanes algorithm
/*

class kadanesAlgorithm{

	public static void  main(String[]args ){
	
	
                  int arr[]=new int []{-2,1,-3,4,-1,2,1,-5,4};
	          int sum=0;int maxSum=Integer.MIN_VALUE;
		  for(int i=0;i<arr.length;i++){
		  
			  sum=sum+arr[i];
			  if(sum>maxSum)
				  maxSum=sum;
			  if(sum<0)
				  sum=0;
		  
		  
		  }
		  System.out.println(maxSum);


		
	}


}
*/
/*
//Finde the index range and   by using kadanes algorithm
class kadanesalgo{

	public static void main(String[]args){
	

                  int arr[]=new int []{-2,1,-3,4,-1,2,1,-5,4};
                  int sum=0;int maxSum=Integer.MIN_VALUE;
		  int startIndex=-1;int endIndex=-1;
		  int x=-1;
		  for(int i=0;i<arr.length;i++){
		  
			  if(sum==0)
				  x=i;
			  sum=sum+arr[i];
			  if(sum>maxSum)
				  maxSum=sum;
			          startIndex=x;endIndex=i;
			  
		         if(sum<0)
				 sum=0;


		  
		  
		  }
		  for(int i=startIndex;i<=endIndex;i++){
		  
			  System.out.print(arr[i]+" ");
		  
		  }
		  System.out.println();
		  System.out.println(maxSum);



	
	
	}


}
*/
/*
// 2 d matrix 
class printMatrix{

	public static void main(String[]args ){
	
		int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[0].length;j++){
			
				System.out.print(arr[i][j]+"  ");
			
			
                          }
			System.out.println();
		
		}
	
	}

}
*/
/*
// print colum by colum
class printmat{

	public static void main(String[]args){
	
                int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i=0;i<arr[0].length;i++){
		
			for(int j=0;j<arr.length;j++){
			
				System.out.print(arr[j][i]+"  ");

			
			}
			System.out.println();

		
		}
	
	}

}
*/
/*
//Q.3) print the row wise sum of the entire matrix 
class rowSum{

	public static void main(String[]args){
	
                int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i=0;i<arr.length;i++){
		
			int sum=0;
			for(int j=0;j<arr[i].length;j++){
			
				sum=sum+arr[i][j];
			
			}
			System.out.println(sum);

		
		}
	
	}

}
*/
/*
//Q.4) print the colum wise sum of entire matrix
class columnSum{

        public static void main(String[]args){

                int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
                for(int i=0;i<arr[0].length;i++){

                        int sum=0;
                        for(int j=0;j<arr.length;j++){

                                sum=sum+arr[j][i];

                        }
                        System.out.println(sum);


                }

        }

} 
*/
/*
//Q) print all sum of matric

class columnSum{

        public static void main(String[]args){
                int totalSum=0;
                int arr[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
                for(int i=0;i<arr[0].length;i++){

                        int sum=0;
                        for(int j=0;j<arr.length;j++){

                                sum=sum+arr[j][i];

                        }
                        totalSum=totalSum+sum;


                }
		System.out.println(totalSum);

        }

}
*/
/*
//Q) print diagonal from square matrix from right to left
class diagonalsqrmat{

	public static void main(String[]args){
	
		int arr[][]=new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i][i]+"  ");

		
		}
	
	
	}

}
*/
/*
//Q) print  diagonal from square matrix from left to right
class diagonalsqrmat{

        public static void main(String[]args){

                int arr[][]=new int [][]{{1,2,3},{4,5,6},{7,8,9}};
                for(int i=arr.length-1;i>=0;i--){

                        System.out.print(arr[i][i]+"  ");


                }


        }

}
*/

















































































































