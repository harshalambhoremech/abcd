package Duplicate;

public class factorial {

	public static void main(String[] args) {
	
		int no= 5;
		int factorial=1;
		
		
		for(int i =1;i<=no;i++) {
			factorial=factorial*i;
		}
     System.out.println(factorial);
	}
 
}

//1*1=1
//1*2=2
//2*3=6
//6*4=24
//24*5=120
