package Duplicate;

public class duplicatel {

	public static void main(String[] args) {
	
		int no[]= {22,44,45,22,44};
		for(int i =0;i<=no.length;i++) {
			for(int j=i+1;j<no.length;j++) {
				if(no[i]==no[j]) {
					System.out.println(no[j]);
				}
			}
		}
		

	}

}
