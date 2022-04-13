package Forloop;

public class Febonasis {

	public static void main(String[] args) {

		int a = 0, b = 1, count = 10;
		for (int i = 0; i <= count; i++) {
			
		int sum = a + b;
		System.out.println(sum);
		a = b;
		b = sum;

	}

}
}