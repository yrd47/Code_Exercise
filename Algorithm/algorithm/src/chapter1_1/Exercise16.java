package chapter1_1;

public class Exercise16 {
	
	public static void main(String[] args) {
		System.out.println(exR1(6));
	}
	
	public static String exR1(int n) {
		if (n <= 0) return "";
		return exR1(n - 3) + exR1(n - 2) + n;
	}

}
