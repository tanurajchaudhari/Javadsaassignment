//bubble Sort
/*
class bubblesort{

	public static void main(String[]args){
	
		int arr[]=new int []{7,3,9,4,2,5,6};
		int count =0;
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr.length-i-1;j++){
			
				count++;
				if(arr[j]>arr[j+1]){
				
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;


				}
			}
		
		}
		for (int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+" ");

		}
		System.out.println();

		
	}
} 
*/
/*

class bubbleSort{
	public static void main(String[]args){
	
		int arr[]=new int []{7,3,9,4,2,5,6};
		int count=0;
		boolean swapped=false;
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr.length-i-1;j++){
			
				count++;
				if(arr[j]>arr[j+1]){
				
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				

				}

			
			}
			if(swapped ==false){
			
				break;

			}
		
		}
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+"  ");
		}


	}
}
*/

//bubble sort by recursion 





/*

class bubbleByRecursion{
	int count=0;
	int bubblesort(int arr,int n){
	
		if(n==1)
			return;
	
		boolean swapped=false;
		for(int i=0;i,n-1;i++){
		
			count++;
			if(arr[j]>arr[j+1]){
			
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;


			
			}
		}
		if(swapped==false)
			return;
		bubblesort(arr,n-1);
	}

	public static void main(String[]args){
	
		int arr[]=new int []{7,3,9,4,2,5,6};
		bubbleByRecursion obj=new bubbleByRecursion();
		obj.bubblesort(arr,arr.length);
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+"  ");

		}

	}
}
*/

//InsertionSort
class InsertionSort{

	public static void main(String[]args){
	
		public static void main(String[]args ){
		
		
			int arr[]=new int []{7,3,9,4,2,5,6};
			for(int i=1;i,arr.length;i++){
			
				int element=arr[i];
				int j=i-1;

				while(j>=0&&arr[j]>element){
				
					arr[j+1]==arr[j];
					j--;

				}
				arr[j+1]=element;

			}

			for(int i=0;i<arr.length;i++){
			
				System.out.print(arr[i]+"  ");
			}

		}
	
	}
}
