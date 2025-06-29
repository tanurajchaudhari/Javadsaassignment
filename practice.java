/*
import java.util.Arrays;
import java.util.Comparator;
class Data{
        double profit;double weight;
	Data(double profit,double weight){
	
		this.profit=profit;
		this.weight=weight;
		System.out.println("profit;- "+profit);
		System.out.println("Weight :- "+weight);

	}
	double  getRatio(){
	
		return profit/weight;
	
	}

}
class fractinalSnapsacks{

	static double getMaxValue(Data[]arr,double Capacity){
	
	Arrays.sort(arr,Comparator.comparingDouble(Data::getRatio).reversed());
			
		for(Data x:arr){
		
			System.out.println(x.getRatio());
		}
		double totalValue=0.0;
	
                for(int i=0;i<arr.length;i++){
		
			Data x=arr[i];
			if(Capacity >=x.weight ){
			
				totalValue+=x.profit;
				Capacity-=x.weight;

			}else{
			
				totalValue+=x.getRatio()*Capacity;
				break;

			}
		 
		}            
	     return totalValue;
	
	}
	public static void main(String[]args){
		Data[]array={ new Data(25,18), new Data(24,15), new Data(15,10)};
		double Capacity=20;
		double getvalue= getMaxValue(array,Capacity);
               System.out.println(getvalue);
	}
}
*/
/*
class GfG {

    // Function to calculate the nth Fibonacci number using
    // recursion
    static int nthFibonacci(int n){
        // Base case: if n is 0 or 1, return n
        if (n <= 1) {
            return n;
        }
        // Recursive case: sum of the two preceding
        // Fibonacci numbers
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String[] args){
        int n = 12;
	n=n-1;
        int result = nthFibonacci(n);
        System.out.println(result);
    }
}
*/
/*
import java.util.Arrays;
import java.util.Comparator;
class Tanuraj{
       int id;int deadline;int profit;
       Tanuraj(int id,int deadline,int profit){
	
		this.id=id;
		this.deadline=deadline;
		this.profit=profit;
	}
}
class jobshedul{
     static int schduleJobs(Tanuraj[] jee,int n){
		Arrays.sort(jee,Comparator.comparingInt((Tanuraj neet) -> neet.profit).reversed());
		boolean[] slots=new boolean[n];
                Arrays.fill(slots,false);
		int totalprofit=0;
		for(int i=0;i<n;i++){
		     for(int j=Math.min(n,jee[i].deadline)-1;j>=0;j--){
			      if(!slots[j]){
					slots[j]=true;
					totalprofit +=jee[i].profit;
			        	break;
				}
			}
		}
		return totalprofit;	
	}
	public static void main(String[]args){
	   Tanuraj[] jee={
		
			new Tanuraj(1,4,20),
			new Tanuraj(2,1,10),
			new Tanuraj(3,1,40),
			new Tanuraj(4,1,30),	   };
		int n=jee.length;
		int maxprofit=schduleJobs(jee,n);
	        System.out.println("final value is :- "+maxprofit);
	}
}
*/
/*
class demo{
         static int getnum(int n){
	 
		 if(n<=1)
			 return n;
		 return getnum(n-1)+getnum(n-2);
	 
	 }
	public static void main(String[]args){
	
		int n=22;
                 n=n-1;
		int getfib=getnum(n);
	        System.out.println(getfib);
	}

}
*/
import java.util.Arrays;
import java.util.Comparator;

class vighanesh{
       double profit;double weight;

	vighanesh(double profit,double weight){
	
		this.profit=profit;
		this.weight=weight;
	
	}
	double getRatio(){
	
		return profit/weight;
	}

}
class jobs{

	
	static double maxv(vighanesh[]Chor,double Cap){
        	Arrays.sort(Chor,Comparator.comparingDouble(vighanesh::getRatio).reversed());
                double  totalvalue=0.0;
		for(int i=0;i<Chor.length;i++){
		
			vighanesh x=Chor[i];

			if(Cap>=x.weight){
			
				totalvalue+=x.profit;
				Cap-=x.weight;

			}else{
			
				totalvalue+=x.getRatio()*Cap;
				break;
			}
			

		
		}
		return totalvalue;
	}

	public static void main(String[]args){
	
		vighanesh [] Chor={new vighanesh(25,18),new vighanesh(24,15),new vighanesh(15,10)};
		double Cap=20;
		double getv=maxv(Chor,Cap);
                System.out.println(getv);
	  
	}
}
