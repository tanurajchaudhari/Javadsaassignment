//Q.1)  Given  matrix of size N*M .print all the diagonals (R->L).Diagonals starting 0th row .
/*
class printDiagonal{

	public static void main(String[]args){
	
		int arr[][]=new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}};
		int N=arr.length;int M=arr[0].length;

		for(int i =M-1;i>=0;i--){
		
			int x=0;int y=i;

			while(y>=0&&x<N){
			
				System.out.print(arr[x][y]+"  ");
				x++;y--;

			
			}
			System.out.println();


		
		}
	
	}
}
*/
/*
//Q.2) Given an square matrix of size N*N convert the matrix to its transpose matrix.
class TransMatrix{

	public static void main(String[]args ){
	
	  int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

		for(int i=0;i<arr.length;i++){
		
			for(int j=i+1;j<arr.length;j++){
			
			
				
				
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;

				
				
			
			}
		
		}
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr.length;j++){
			
				System.out.print(arr[i][j]+"  ");

			
			} System.out.println();
		
		
		}
	
	
	}


}
*/
/*
//Q.3) Given a matrix of N*N rotate the matrix  90 degree clockwise  from top right  corner note (nonew matrix);
class rotateMat{

	public static void main(String[]args){
	
		int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int len=arr.length;int x=len-1;
                
	//transpoe it 
	for(int i=0;i<arr.length;i++){
	
		for(int j=i+1;j<arr.length;j++){
		
		
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;

		
		}
	}
	//reverseit
	for(int i=0;i<arr.length;i++){
	
		int start =0;int end=arr.length-1;
		while(start<end){
		
			int temp =arr[i][start];
			arr[i][start]=arr[i][end];
			arr[i][end]=temp;

			start++;end--;
		
		}

	
	}
	//print
                for(int i=0;i<arr.length;i++){

                        for(int j=0;j<arr.length;j++){

                                System.out.print(arr[i][j]+"  ");


                        } System.out.println();


                }

	}
}
*/
/*
//Q.4)   given a N*N matrics print boundry in clockwise fashion
class printBoundry{

	public static void main(String[]args){
                int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int i=0;int j=0;int n=arr.length;
		for(int x=0;x<n-1;x++){
		
			System.out.print(arr[i][j]+"  ");
			j++;
		
		}
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        i++;

                }
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        j--;

                }
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        i--;

                }
	
	}

}
*/
/*
//Q.5)  Given a N*N matrix print it in spiral function
class spiral{

	public static void main(String[]args ){
	
		int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	           

		int n=arr.length;
		int i=0;int j=0;
		while(n>1){
		
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        j++;

                }
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        i++;

                }
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        j--;
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        j++;

                }
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        i++;

                }
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        j--;

                }
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        i--;

                }
                }
                for(int x=0;x<n-1;x++){

                        System.out.print(arr[i][j]+"  ");
                        i--;

                }
                 n=n-2;i++;j++;

		
		
		}
		if(n==1){
		
			System.out.print(arr[i][j]+"  ");

		
		}
	




    	 }
}
*/
/*
//Q..) print all diagonals of square matrix (l->R)or(R->L)    A. starting from 0th row , B..) all diagonals 
class allDiagonals{

	public static void main(String[]args ){
	
                int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int M=arr[0].length;
		int N=arr.length;
		for (int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[0].length;j++){
			
			
				System.out.print(arr[i][j]+" ");
			}
		 System.out.println();
		
		
		}
		System.out.println("***************************************");
		for(int i=M-1;i>=0;i--){
		
			int x=i;
			int y=0;
			
			while(y<N&&x>=0){
			
				System.out.print(arr[y][x]+"  ");
				y++;x--;
			
                 	}
			System.out.println();
 		
		
	     	} System.out.println();

	      for(int i=1;i<arr.length;i++){
	
		int x=i;int y=arr[i].length-1;

		while(x<arr.length && y>=0){
		
			System.out.print(arr[x][y]+"  ");
			x++;y--;
		}
	        System.out.println();

	
	}
	
	
	}

}

*/

//Q2. )   Given  a rectangular matrix N*M convert the matrix to its transpose


class allDiagonals{

        public static void main(String[]args ){

                int arr[][]=new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
                int M=arr.length;
		int N=arr[0].length;
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
			
				System.out.print(arr[i][j]+"  ");
			
			}
			System.out.println();
		}
                System.out.println("**********************************************");
		int tarr[][]=new int[arr[0].length][arr.length];

		for(int i=0;i<arr[i].length;i++){
		
			for(int j=0;j<arr.length;j++){
			
                                 tarr[i][j]=arr[j][i];

				//int temp=arr[i][j];
				//arr[i][j]=arr[j][i];
				//arr[j][i]=temp;
			
			
			}
		
		}
             for(int i=0;i<tarr.length;i++){
	     
	     
		     for(int j=0;j<tarr[i].length;j++){
		     
			     System.out.print(tarr[i][j]+"  ");
		     }
		     System.out.println();

	     
	     }

	}
}




















