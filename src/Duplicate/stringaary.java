package Duplicate;

public class stringaary {

	public static void main(String[] args) {
		
		String name[]= {"Gaurv","Nikita","Feeroz","Nikita","Feeroz"};
		for(int i =0;i<=name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i]==name[j]) {
					System.out.println(name[j]);
				
					
				}
			}
		}

	}

}
