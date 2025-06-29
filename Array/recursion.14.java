/*
class recursion {


	
		void fun(int num){
			if(num==0)
				return ;

			System.out.println(num);
			fun(--num);   		
		}
		public static void main(String[]args ){
		
			System.out.println("Startv main");
			recursion obj = new recursion();
			obj.fun(2);
			System.out.println("ENd main");
		
		}

}
*/
/*
class Recursion{

	void fun(int num){
	
		if(num ==0){
		
			return;
		}
		fun(--num);
		System.out.println(num);

	}
	public static void main(String[]args ){
	
		System.out.println("Start main");
		Recursion obj= new Recursion();
		obj.fun(2);
		System.out.println("End Main");
	}

}
*/
/*
class Recursion{

	void fun(int num){
	
		if(num==0){
		
			return;

		}
		num= 5 + fun(--num);
		System.out.println(num);

	}
	public static void main(String[]args){
	
		System.out.println("Stsart main");
		Recursion obj=new Recursion();
		obj.fun(2);
		System.out.println("End Main");

	
	}
}
*/
/*
class Recursion{

	int fun(int num){
	
		if(num==1)
			return 1 ;
		return fun(--num)+3;
                
	
	}
	public static void main(String[]args ){
	
		System.out.println("Stsart main");
                Recursion obj=new Recursion();
                obj.fun(2);
                System.out.println("End Main");
	
	}


}
*/

/*
class sumofN{

	int fun(int num){
	
		if(num==1){
		
			return 1;
		}
		return num+fun(--num);
	}
	public static void main(String[]args ){
	
	
		System.out.println("Start main");
		sumofN obj=new sumofN();
		int retsum = obj.fun(5);
		System.out.println(retsum);
		System.out.println("End Main");

	
	
	}

}
*/

/*
class sumofN{

	int sum=0;
	int fun(int num){
	
		if(num==0)
			return 1;
		sum=sum+num;
		fun(--num);
		return(sum);
	}
	public static void main(String[]args ){
	

                System.out.println("Start main");
                sumofN obj=new sumofN();
                int retsum = obj.fun(5);
                System.out.println(retsum);
                System.out.println("End Main");


	
	
	}

}
*/
/*
class sumofDigit{

	int sum =0;
	int sumBigit(int num){
	
		if(num ==0)
			return sum;
		sum=sum+(num%10);
		num=num/10;
		sumDigit(num);
		return sum;
	}
	public static void main(String[]args ){
	
		System.out.println("Start main ");
		
		sumofDigit obj=new sumofDigit();
		int retsum=obj.sumdigit(1526);
		System.out.println(retsum);

		System.out.println("End Main ");	
	
	}

}
*/
/*
class sumofDigit{

	int sum=0;
	int sumDigit(int num){
	
		if(num==0)
			return 0;
		return num%10 + sumDigit(num/10);
	
	}
	public static void main(String[]args ){
	
                System.out.println("Start main ");

                sumofDigit obj=new sumofDigit();
                int retsum=obj.sumDigit(1526);
                System.out.println(retsum);

                System.out.println("End Main ");
	
	}


}
*/

//*************************Double recursion***************************
/*
class DoubleRecursion{

	int fun(int num){
	
		if(num<=1)
			return 1;
		return fun(num-2)+fun(num-1);

	
	}
	public static void main(String[]args ){
	
		DoubleRecursion obj =new DoubleRecursion();
		int ret =obj.fun(5);
		System.out.println(ret);

	
	}

}
*/
/*

class  DoubleRecursion{

	void fun(int num){
	
		if(num<=1){
		
			return ;
		}
		fun(num-2);
		System.out.println(num);
		fun(num-1);
	}
		public static void main(String[]args ){
		
			DoubleRecursion obj=new DoubleRecursion();
			obj.fun(5);

		
		}
	
}
*/
/*
import java.util.*;
class Factorial{

	int fact(int num){
	
		int factno=1;
		for(int i=num;i>=1;i--){
		
			factno=factno*i;
		}
		return factno;

	
	}
	public static void main(String[]args){
	
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		Factorial obj=new Factorial();
		int ret=obj.fact(num);
		System.out.println(ret);

	
	}

}
*/
/*
import java.util.*;
class Factorial{

        int fact(int num){

              if(num==0)
		      return 1;
	      return num*fact(num-1);



        }
        public static void main(String[]args){

                Scanner sc= new Scanner(System.in);
                int num=sc.nextInt();
                Factorial obj=new Factorial();
                int ret=obj.fact(num);
                System.out.println(ret);


        }

}
*/

//recursive reverse string 
/*
class StringRev{
	String  revString(String str){
	
		if(str==null||str.length()<=1){
		
			return str;
		}
		return revString(str.substring(1))+str.charAt(0);
	
	}

	public static void main(String[]args){
	
		String str="core2web";
		StringRev obj=new StringRev();
		String reverse= obj.revString(str);
		System.out.println(reverse);
	
	}

}
*/
import java.util.*;
class fibonaccino{

          int fibno(int num){
	  
		  if(num<=1){
		  
			  return 1;
		  }
		  return fibno(num-1) + fibno(num-2);
	  
	  }

	public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
	 num=num-1;
	 fibonaccino obj=new fibonaccino();
	 int value= obj.fibno(num);
	 System.out.println(value);



	}
}






