package Forloop;

public class Duplicatecount {

	public static void main(String[] args) {
		String name="Gaurav";
		int count =0;
		
		for(int i =0;i<name.length();i++) {
			char a=name.charAt(i);
			if(a == 'G') {
				count++;
				
			}
			
			}
		System.out.println(count);
		}

	}

