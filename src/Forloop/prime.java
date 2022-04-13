package Forloop;

public class prime {

	public static void main(String[] args) {
		//program for prime no
		// no which is divisible by 1 and by itself is an primr no
		
		int number=22;
		int y = 0;
		
		for(int i =2;i<number;i++) {
			
			if (number%i==0) {
				
				y++;
			}
			
		}
		if (y<0) {
			System.out.println(number + "is an prime no");
		}
		else {
			System.out.println(number +"is not prime no");
		}
		

	}

}
