package Forloop;

public class armstrongno {

	public static void main(String[] args) {
		int reminber=0;
		int number =0;
		int sum =0;
		System.out.println("Armstrong number is =");
		
		for(int i=1;i<=500;i++) {
			number = i;
			while(number>0) {
				int remainder = number%10;
				number = number/10;
				sum=sum+(remainder  *remainder  * remainder );
			}
			if(i==sum) {
				System.out.println(i);
			}
			sum=0;
		}

	}

}
