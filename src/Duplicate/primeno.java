package Duplicate;

public class primeno {

	public static void main(String[] args) {
		//prime no 
		int no=20;
		int  y =0;
		
		
	for(int i=2; i<no;i++) {
		if(no%i==0)
		{
			y++;
		}
		
		}
	if(y<0) {
		
		System.out.println("no is prime no="+no);
	}
	else {
		System.out.println("not prime no="+no);
		}
	}
}

	
			


