package Duplicate;

public class Duplicatearray {

	public static void main(String[] args) {
		
		int num[]= {22,14,19,14};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					System.out.println("duplicates num ="+  num[j]);
				}
			}
		}

	}

}
