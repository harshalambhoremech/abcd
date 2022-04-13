package Duplicate;

public class fabonisisserice {

	public static void main(String[] args) {
		
		int a=0, b=1,count=20;
		for(int i=0;i<=count;i++) {
			//0+1=1
			int sum=a+b;
			System.out.println(sum);
			//a=1
			a=b;
			//b=1
			b=sum;
			
		}
		

	}

}
