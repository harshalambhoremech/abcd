package Sting;

public class reverse {

	public static void main(String[] args) {
	String e="jdshgfjWEFG43FGNFG543FGFG";
	String rev = "";
	
	for(int i=e.length()-1;i>=0;i--) {
		
		rev = rev+e.charAt(i);
	}
	System.out.println(rev);

	}
	

}
