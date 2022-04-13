package Duplicate;

public class Duplicatestring {

	public static void main(String[] args) {
		
		String name[]= {"Gautav","Nikita","Feeroz","Nikita"};
		for(int i =0;i<=name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i]==name[j]) {
					System.out.println(name[j]);
				}
			}
		}
				

	}

}
