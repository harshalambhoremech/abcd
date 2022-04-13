package Forloop;

public class WhileAmstrong {

	public static void main(String[] args) {
		int number=153;
		int rem;
		int sum = 0;
		int tep=number;
		while(tep!=0) {
			
			rem = number%10;
			number= number/10;
			sum=sum+(rem*rem*rem);
			
		}
        if(sum==tep) {
		System.out.println("no is amstrong"+sum);
		
        }
		
        else{
			System.out.println("sum is not amstrong"+sum);
		}
		
		}

	}


