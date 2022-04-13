package Forloop;

public class perfectno {

	public static void main(String[] args) {
		
		// perfect no is the addition of that table no= that no ;
		
		int a=28;//1+2+4+7+14=28
		int sum =0;  
		
		
		for(int i =1;i<a;i++) {
			
			if(a%i==0) {
				
				sum=sum+i;
			}
			
			
		}
		if (sum==a) {
			
			System.out.println("perfect no");
		}
		else {
			System.out.println("no perfect number");
		}
	}

}
