//quik sort 
//in this sorting we take one element in random and place it their actual exact position ..
import java.util.*;
class QuickSortAlgo{
	int partition(int arr[],int start,int end){
	
		int pivote=arr[end];
                int i=start-1;
		for(int j=start;j<end;j++){
		
			if(arr[j]<=pivote){
			
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}

		}
		int temp =arr[i+1];
		arr[i+1]=arr[end];
		arr[end]=temp;

		return i+1;


	
	}
	void QuickSort(int arr[],int start,int end){
	
		if(start<end){
		
			int pivoteindex=partition(arr,start,end);
			QuickSort(arr,start,pivoteindex-1);
			QuickSort(arr,pivoteindex+1,end);

		}
	}

	public static void main(String[]args){
	
		int arr[]=new int[]{12,7,6,14,5,15,10};
		System.out.println(Arrays.toString(arr));
		QuickSortAlgo obj=new QuickSortAlgo();
		obj.QuickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
