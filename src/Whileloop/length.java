package Whileloop;

public class length {

	public static void main(String[] args) {
		//  program for length of the no
		//for that we require to variabe
		
		int i = 1231656;
		int length = 0;
		
		while(i!=0) {
			
			i=i/10;
			length++;
		}
		System.out.println(length + "length of the no");

	}

}
