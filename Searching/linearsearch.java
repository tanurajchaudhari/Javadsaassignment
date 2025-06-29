import java.io.*;
class linearsearch{

	static int linear(int []arr,int key){
	
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]==key){
			
				return i;
				
			
			}
		}
		return -1;
}
	public static void main(String[]args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array");
		int N=Integer.parseInt(br.readLine());
		int arr[]=new int[N];
		for(int i=0;i<N;i++){
		
		   arr[i] =Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the key");
		int key=Integer.parseInt(br.readLine());
		int value=linear(arr,key);
                if(value==-1){
		
			System.out.println(" not found ");
		}else{
		
			System.out.println("at index :"+ value);
		}

	
	}

}
