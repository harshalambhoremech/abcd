package Duplicate;

public class Diplicateletter {
//eclips has good ui
	public static void main(String[] args) {
		
		String  name ="Feeroz";
		int count =0;
		
		for(int i =0;i<name.length();i++) {
			
			char a=name.charAt(i);
			if(a == 'e') {
				
				count++;
			}
		}
		System.out.println("count of alphabetis" + count);

	}

}
