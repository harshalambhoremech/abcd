package Duplicate;

public class Reversenumber {

	public static void main(String[] args) {
		// Reverse no
		
		int i =51445464;
		int reminder =0;
		int reverse =0;
		
		while(i!=0) {
			reminder=i%10;
			reverse =reverse*10+reminder;
			i=i/10;
		}
		System.out.println(reverse);
		

	}

}
