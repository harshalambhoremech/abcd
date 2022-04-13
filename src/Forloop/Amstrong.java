package Forloop;

public class Amstrong{

	public static void main(String[] args) {
		
		//profram for amstrong no in bet 1-500;
		int number=0;
		int reminder=0;
		int sum=0;
		
		System.out.println("Amstrong sumber is=");
		
	for(int i=1;i<=500;i++) {
		number=i;//153//15//1
		while(number>0) {
			reminder = number%10;//3//5//1
			number=number/10;//15//1//1
			sum = sum+(reminder*reminder*reminder);
//              27= 0+(3*3*3
//                152= 27+(5*5*5)
			     //  153  =152+(1*1*1)
			//
			
		}
		if (i==sum) {
			
			System.out.println(i);
		}
		sum=0;
		
		
		
		
		
	}
		      
		    		  
		

	}

}
