package Swaping;

public class swapingno {

	public static void main(String[] args) {
		//swaping of nowiyhout using thied variable
		
		int a=20;
		int b=30;
		
		System.out.println("before swaping the no a and b are "   +   a  +  b );
		
		
		a=a+b;
		// 20+30=50
		
		
		b=a-b;
		//50-30=20=b
		
		
		a=a-b;
		//50-20=30=a

		
		System.out.println("after swaping the no a and b are "   +   a  +  b);
	}

}
