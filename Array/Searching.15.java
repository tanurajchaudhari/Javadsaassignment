//Linear Search
import java.io.*;
class  userarray{

	public static void main(String[]args )throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the length of array");
		int N=Integer.parseInt(br.readLine());
		int arr[]=new int [N];
		for(int i=0;i<N;i++){
		
			arr[i]=Integer.parseInt(br.readLine());

		
		}
		for(int i=0;i<N;i++){

                        System.out.print(arr[i]+"  ");


                }
		System.out.println();
		System.out.println("Enterthe key u want search ");
		int K=Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++){
		
			if(arr[i]==K){
			
				System.out.println("key found at index : "+ i);

			        break;

			
			}else if(i==N-1){
			
				System.out.println("Key not found ");

			
			}
			
				
		
		}



	}

}
