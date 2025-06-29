/*
//Equillibrium  index fro the array
class  EquillibriumIndex{

	public static void main(String[]args){
	
		int arr[]=new int []{-7,1,5,2,-4,3,0,};
                int flag=0;
		for(int i=0;i<arr.length;i++){
		
			int leftSum=0;int rightSum=0;
			 for(int j=0;j<i;j++){
			 
				 leftSum=leftSum+arr[j];

			 
			 }
			 for(int j=i+1;j<arr.length;j++){
			 
			 
				 rightSum=rightSum+arr[j];

			 
			 }
			 if(leftSum==rightSum){
				 flag=1;
			         System.out.println("Equillibrium index is "+ i);
			         break;
                          }
		  }
		
		if(flag==0){
		
			System.out.println("Index is not found");

		}

	
	}

}
*/

//Q3) find the shortest  SubArray containing both min and max 
class SubAray{

	public static void main(String[]args ){
	
		int arr[]=new int []{ 2,2,6,4,5,1,5,2,6,4,1};
		
		int minLen=Integer.MAX_VALUE;
		int minVal=Integer.MAX_VALUE;
		int maxVal=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>maxVal)
				maxVal=arr[i];
			if(arr[i]<minVal)
				minVal=arr[i];

		
		}
                
		System.out.println("Maxvalue is :-"+maxVal);
	        System.out.println("MinValue is :-"+minVal);
                 int flag1=0;int flag2=0;
                  int indexi=0;int indexj=0;

		for(int i=0;i<arr.length;i++){
		
			int len=0;
			if(arr[i]==minVal){
			        

				for(int j=i+1;j<arr.length;j++){
			             
				      if(arr[j]==maxVal){
				             len=j-i+1;
					     
					 if(minLen>len){
					 
						 minLen=len;
						 flag1=1;
						 System.out.println("if  block is work");
                                                   indexj=j; indexi=i;

					 }
					     
				     
				     }	

				
				}
			
			} else if( arr[i]==maxVal){
			         
				for(int j=i+1;j<arr.length;j++){
				
					if(arr[j]==minVal){
					        

						len=j-i+1;
						if(minLen>len){
						
							minLen=len;
							flag2=1;
							System.out.println("Elseif block work");
							indexi=i;indexj=j;
						}
					
					}
				
				}
			
			}
		
		
		}
		if(flag1==1){
		
			System.out.println("index of minval  "+minVal+"  : "+indexi);
			System.out.println("indexof maxVal "+maxVal+" : "+indexj);
		        System.out.println("lenght by index "+(indexj - indexi+1) );
		}
		if(flag2==1){
		
                        System.out.println("index of minval  "+minVal+"  : "+indexj);
                        System.out.println("indexof maxVal "+maxVal+" : "+indexi);
		        System.out.println("lenght by index "+(indexj-indexi+ 1) );
		}
           
	    System.out.println("Shortext len is :- "+minLen);
	}
}
