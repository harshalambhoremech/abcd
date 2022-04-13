package Duplicate;

public class Lengthofno {

	public static void main(String[] args) {
		int num=12;
	int	length=0;
		
		while(num!=0) {
			
			num= num/10;
			length++;
		}
		System.out.println("lenth of no "+length);

	}

}
