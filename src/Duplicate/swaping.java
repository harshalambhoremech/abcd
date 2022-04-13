package Duplicate;

public class swaping {

	public static void main(String[] args) {
		// befor swaping
		int a=10;
		int b=20;
		
		System.out.println("Value of A="+a);
		System.out.println("Value of B="+b);
		
		//After Swaping 
		a=a+b; //a=30
		b=a-b;// b=30-20=10
        a=a-b;//30-10=20
        
        System.out.println("now Value of a="+a);
        System.out.println("Now value of b="+b);

	}

}
