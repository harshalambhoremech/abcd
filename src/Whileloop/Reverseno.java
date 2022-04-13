package Whileloop;

public class Reverseno {

	public static void main(String[] args) {
	// program for the reverse no
		// we required tree variable
		// no, reminder and rev
		
		int i = 123456;
		int remider= 0;
		int rev= 0;
		
		
		while(i!=0){
			
			remider = i%10;
		 rev= rev*10+remider;
		 i=i/10; 
			
			
		}
		System.out.println(rev);

	}

}
