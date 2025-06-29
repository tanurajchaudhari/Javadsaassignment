/*
import java.io.*;

class factors{

	public static void main(String[]args)throws IOException{

             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
		int num=Integer.parseInt(br.readLine());

		int count=0;
		for(int i=1;i<=num;i++){
		
			if(num%i==0){
			
				count++;
		
			}

		
		}
		System.out.println("the factors are "+count);
	


	}



}
*/

import java.io.*;

class factors{

        public static void main(String[]args)throws IOException{

             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                int num=Integer.parseInt(br.readLine());
                int iterations=num/4;
		System.out.println(iterations);

                int count=0;int itr=1;
                for(int i=1;i<(num/4);i++){

                        if(num%i==0){

                                count+=2;

                        }
                  System.out.println("Number of iteration :- "+itr++);

                }
		count+=1;
                System.out.println("the factors are "+count);
        }
}
