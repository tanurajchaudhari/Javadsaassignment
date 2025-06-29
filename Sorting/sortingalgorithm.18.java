// Selection sort 
//  get the minimum value and store  at first , in this first aray is sorted and another is unsorted 
/*
class SelectionSort{


	public static void main(String[]args ){
	
		int arr[]=new int[]{9,2,7,3,8,4,1,6};
		for(int i=0;i<arr.length-1;i++){
		
			int min_index=i;
			for(int j=i+1;j<arr.length;j++){
			
				if(arr[j]<arr[min_index]){
				
					min_index=j;
				}
			
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;

		} 

		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+"  ");

		
		}
		System.out.println();
  }
}
*/
/*
// Selection sort by recursion 
class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[]{9, 2, 7, 3, 8, 4, 1, 6};

     
        selectionSort(arr, 0);

     
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

   
    static void selectionSort(int[] arr, int startIndex) {

        if (startIndex >= arr.length - 1) {
            return;
        }

      
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

      
        int temp = arr[startIndex];
        arr[startIndex] = arr[minIndex];
        arr[minIndex] = temp;

       
        selectionSort(arr, startIndex + 1);
    }
}

*/

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>MERGE SORT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
/*
class  merge2sortedarray{

	public static void main(String[]args){
	
		int arr1[]=new int[]{3,7,9,11};
		int arr2[]=new int[]{2,5,8};
		int n=arr1.length+arr2.length;
		int arr3[]=new int[n];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length){
		
			if(arr1[i]<arr2[j]){
			
				arr3[k]=arr1[i];
				i++;
			}else{
			
			
				arr3[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length){
		
			arr3[k]=arr1[i];
			i++;k++;
		}
		while(j<arr2.length){
		
			arr3[k]=arr2[j];
			j++;k++;
		}
		for(int x=0;x<arr3.length;x++){
		
			System.out.print(arr3[x]+"  ");
		}
		System.out.println();

	}
}
*/

//>>>>>>>>>>>>>merge sort code >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>...
class mergesort{
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
	public static void main(String[]args){
		int arr[]=new int[]{9,1,8,2,7,3,6,4};
		int start =0; int end=arr.length-1;
		mergesort obj=new mergesort();
		obj.mergeSortmethod(arr,start,end);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
}
